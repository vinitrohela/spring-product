//package com.allstate.controllers;
//
//import com.allstate.entities.Product;
//import com.allstate.services.ProductService;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//
//import static org.mockito.BDDMockito.given;
//import static org.mockito.Matchers.any;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static sun.nio.cs.Surrogate.is;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(ProductController.class)
//public class ProductControllerTest {
//
//    @Autowired
//    private MockMvc mvc;
//
//    @MockBean
//    private ProductService service;
//
//    private Product product;
//
//    @Before
//    public void setUp() throws Exception {
//
//    }
//
//    @After
//    public void tearDown() throws Exception {
//
//    }
//
//    @Test
//    public void shouldCreateProduct() throws Exception {
//        given(this.service.create(Mockito.any(Product.class)))
//                .willReturn(product);
//
//        MockHttpServletRequestBuilder request = post("/product")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"name\":\"camera\"}");
//
//        this.mvc.perform(request)
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", is(1)))
//                .andExpect(jsonPath("$.name", is("camera")));
//    }
//}