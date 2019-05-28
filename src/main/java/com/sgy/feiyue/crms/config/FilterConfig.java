package com.sgy.feiyue.crms.config;

import com.sgy.feiyue.crms.security.filter.CORSFilter;
import com.sgy.feiyue.crms.security.filter.JwtSecurityFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author SGY
 * @Date 2019/5/20 16:09
 * @Description //过滤器配置类
 **/
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean corsFilter() {
        FilterRegistrationBean regist = new FilterRegistrationBean();
        regist.setFilter(new CORSFilter());
        regist.addServletNames("CORSFilter");
        regist.addUrlPatterns("/*");
        regist.setOrder(1);
        return regist;
    }

    @Bean
    public FilterRegistrationBean jwtSecurityFilter() {
        FilterRegistrationBean regist = new FilterRegistrationBean();
        regist.setFilter(new JwtSecurityFilter());
        regist.addServletNames("JwtSecurityFilter");
        regist.addUrlPatterns("/*");
        regist.setOrder(10);
        return regist;
    }
}
