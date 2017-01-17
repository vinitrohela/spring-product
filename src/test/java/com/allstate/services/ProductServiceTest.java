package com.allstate.services;

import com.allstate.entities.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql (value = {"/sql/seed.sql"})
public class ProductServiceTest {

    @Autowired
    private ProductService service;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateProduct() throws Exception {
        Product before = new Product();
        before.setName("nikon");
        Product after = this.service.create(before);
        assertEquals(1, after.getId());
        assertEquals("nikon", after.getName());
    }

    @Test
    public void shouldFindAllProducts() throws Exception {
        Product before = new Product();
        before.setName("nikon camera");
        Product after = this.service.create(before);
        Product second = new Product();
        second.setName("nikon");
        Product result = this.service.create(second);

        Iterable<Product> products = this.service.findAll();
        List<Product> list = (List) products;
        assertEquals(2,list.size());
    }

    @Test
    public void shouldFindProductById() throws Exception {
        Product before = new Product();
        before.setName("canon");
        Product after = this.service.create(before);
        assertEquals(1, after.getId());
        assertEquals("canon", after.getName());

        Product result = this.service.findById(after.getId());
        assertEquals(after.getId(),result.getId());
    }

    @Test
    public void shouldNotFindProductByIdIfIdIsNotPresent() throws Exception {
        Product before = new Product();
        before.setName("canon");
        Product after = this.service.create(before);

        Product result = this.service.findById(23);
        assertNull(result);
    }

    @Test
    public void shouldFindProductByName() throws Exception {
        Product before = new Product();
        before.setName("canon");
        Product after = this.service.create(before);
        assertEquals(1, after.getId());
        assertEquals("canon", after.getName());

        Product result = this.service.findByName("canon");
        assertEquals(before,result);
    }

    @Test
    public void shouldDeleteProductById() throws Exception {
        Product before = new Product();
        before.setName("canon");
        Product after = this.service.create(before);

        this.service.delete(after.getId());
        Product p = this.service.findByName("canon");
        assertNull(p);

    }

    @Test(expected = org.springframework.dao.EmptyResultDataAccessException.class)
    public void shouldNotDeleteProductById() throws Exception {
        Product before = new Product();
        before.setName("canon");
        Product after = this.service.create(before);
        this.service.delete(2);
    }

    @Test
    public void shouldUpdateProductById() throws Exception {
        Product before = new Product();
        before.setName("canon");
        Product after = this.service.create(before);

        Product updateProduct = new Product();
        updateProduct.setName("canon updated");
        Product result = this.service.update(after.getId(), updateProduct);
        assertEquals(1,result.getVersion());

    }
}