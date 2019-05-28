package com.sgy.feiyue.crms.security.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sgy.feiyue.crms.common.util.DataRet;
import com.sgy.feiyue.crms.security.JwtSubject;
import com.sgy.feiyue.crms.security.util.CustomJWT;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * @Author SGY
 * @Date 2019/5/14 19:06
 * @Description //过滤所有未携带token的请求
 **/
public class JwtSecurityFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(JwtSecurityFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        //打印请求的uri
        logger.info(getRequestInfo(request));
        //过滤请求
        if (containsUri(uri)) {
            filterChain.doFilter(request, response);
            return;
        }
        ObjectMapper mapper = new ObjectMapper();
        //获取token
        String authToken = request.getHeader("Authorization");
        if (authToken == null || authToken.isEmpty()) {
            String accessToken = request.getParameter("token");
            if (accessToken == null || accessToken.isEmpty()) {
               response.getWriter().write(mapper.writeValueAsString(DataRet.permissionDeny()));
               response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
               return;
            }
            authToken = "bearer " + accessToken;
        }
        logger.info("token--" + authToken);
        if (authToken.length() < 7) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write(mapper.writeValueAsString(DataRet.permissionDeny()));
            return;
        }
        //解析token
        String head = authToken.substring(0, 6);
        if (!"bearer".equalsIgnoreCase(head)) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write(mapper.writeValueAsString(DataRet.permissionDeny()));
            return;
        }
        String token = authToken.substring(7);
        Claims claims = null;
        try{
            claims = CustomJWT.parseToken(token);
        } catch (ExpiredJwtException e) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write(mapper.writeValueAsString(DataRet.error("访问权限已过期")));
            return;
        } catch (Exception e) {
            response.getWriter().write(mapper.writeValueAsString(DataRet.error("用户认证错误")));
            return;
        }
        if (claims == null || claims.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write(mapper.writeValueAsString(DataRet.permissionDeny()));
            return;
        }
        //验证成功返回
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

    private String getRequestInfo(ServletRequest request) {
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        String method = httpRequest.getMethod().toUpperCase();
        StringBuffer requestURL = httpRequest.getRequestURL();
        Map<String, String[]> parameterMap = httpRequest.getParameterMap();
        StringBuffer params = new StringBuffer();
        for (String key : parameterMap.keySet()) {
            String v;
            Object obj = parameterMap.get(key);
            if (obj instanceof Object[]) {
                v = Arrays.toString((Object[]) obj);
            } else {
                v = obj.toString();
            }
            params.append(key + "=" + v);
        }
        StringBuffer body = new StringBuffer();
        String msg = "[请求]:" + method + ":" + requestURL + " [参数]:" + params.toString() + " [请求体]:" + body.toString();
        return msg;
    }

    private boolean containsUri(String uri) {
        if (uri.contains("/oauth/authorize") || uri.contains("/login")) {
            return true;
        }
        return false;
    }
}
