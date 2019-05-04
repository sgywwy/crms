package com.sgy.feiyue.crms.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class RoomInfoControllerTest {
    @Autowired
    private WebApplicationContext context;

    private MockMvc mock;

    @Before
    public void setUp() throws Exception {
        // 初始化mock对象
        mock = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testRequest() throws Exception{
        String uri = "/room";
        String json = "{\"roomId\":\"\",\"roomNumber\":\"\",\"roomName\":\"\",\"roomStates\":[],\"roomTypes\":[],\"roomBuildings\":[],\"roomCapacity\":\"\",\"sort\":\"\",\"page\":1,\"pageSize\":2}";
        // .getRoomList()
        RequestBuilder requestBuilder = post(uri + "/search");
        mock.perform(((MockHttpServletRequestBuilder) requestBuilder)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json)
        )
//                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());

//        requestBuilder = get(uri + "/zf103");
//        mock.perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print());

//        requestBuilder = delete(uri + "/0");
//        mock.perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print());

    }


}