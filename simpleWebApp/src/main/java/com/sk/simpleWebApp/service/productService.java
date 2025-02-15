package com.sk.simpleWebApp.service;

import com.sk.simpleWebApp.product.product;
import com.sk.simpleWebApp.repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class productService {
    @Autowired
    productRepo repo;
    //List<product> products=new ArrayList<>(Arrays.asList(new product(101,"Iphone",50000),new product(102,"Samsung",55000)));
    public List<product> getProducts(){
        return repo.findAll();
    }
    public product getProductById(int prodId){
        return repo.findById(prodId).orElse(new product());
    }
    public void addProduct(product prod){
        repo.save(prod);
    }

    public void updateProduct(product prod) {
       repo.save(prod);
    }

    public void deleteProduct(int prodId) {
      repo.deleteById(prodId);
        }
    }

