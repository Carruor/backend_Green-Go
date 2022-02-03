package com.marketplace.GreenAndGo.controller;

import com.marketplace.GreenAndGo.model.Product;
import com.marketplace.GreenAndGo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping

public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id){
        try{
            Product product=productService.getById(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }

}}
