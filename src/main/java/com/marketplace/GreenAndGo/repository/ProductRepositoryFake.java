package com.marketplace.GreenAndGo.repository;

import com.marketplace.GreenAndGo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductRepositoryFake implements ProductRepository{


    @Override
    public List<Product> getAll() {
        List <Product> productList = new ArrayList<Product>();
        Product product1 = new Product("planta", "url", "bonita", 1, 15 );
        Product product2 = new Product("plantaz", "url", "bonitx", 1, 15 );
        Product product3 = new Product("plantax", "url", "bonitz", 1, 15 );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return productList;
    }

    @Override
    public Product getById(Integer id) {
        return new Product("planta", "url", "bonita", 1, 15 );
    }

}