package com.allstate.services;

import com.allstate.entities.Product;
import com.allstate.repositories.IProductRespostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private IProductRespostory respostory;

    @Autowired
    public void setRespostory(IProductRespostory respostory) {
        this.respostory = respostory;
    }

    public Product create(Product p) {
        return this.respostory.save(p);
    }

    public Iterable<Product> findAll(){
        return this.respostory.findAll();
    }

    public Product findById(int id) {
        return this.respostory.findOne(id);
    }

    public Product findByName(String name) {
        return this.respostory.findByName(name);
    }

    public void delete(int id) {
        this.respostory.delete(id);
    }

    public Product update(int id, Product updateProduct) {
        Product old = this.respostory.findOne(id);
        old.setName(updateProduct.getName());

        return this.respostory.save(old);
    }
}
