package com.sk.simpleWebApp.controller;

import com.sk.simpleWebApp.product.product;
import com.sk.simpleWebApp.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class productController {
    @Autowired
    productService service;
    @GetMapping("/products")
    public List<product> GetProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody product prod){
        service.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
