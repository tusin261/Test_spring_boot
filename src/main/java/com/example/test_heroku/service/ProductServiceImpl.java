package com.example.test_heroku.service;

import com.example.test_heroku.entity.Product;
import com.example.test_heroku.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl{

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProduct() {

        return repository.findAll();
    }

    public Product addNewProduct(Product p) {
        return repository.save(p);
    }
}
