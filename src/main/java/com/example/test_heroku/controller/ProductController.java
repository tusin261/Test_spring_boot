package com.example.test_heroku.controller;

import com.example.test_heroku.entity.Product;
import com.example.test_heroku.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/")
    public List<Product> getAll(){
        return productService.getAllProduct();
    }

    @PostMapping("/")
    public Product addNewPro(@RequestBody Product p){
        productService.addNewProduct(p);
        return p;
    }
}
