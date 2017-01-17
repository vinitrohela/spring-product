//package com.allstate.controllers;
//
//import com.allstate.entities.Product;
//import com.allstate.services.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(value = "/products")
//public class ProductController {
//    private ProductService service;
//
//    @Autowired
//    public void setService(ProductService service) {
//        this.service = service;
//    }
//
//    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
//    public Product create(@RequestBody Product product){
//        return this.service.create(product);
//    }
//}
