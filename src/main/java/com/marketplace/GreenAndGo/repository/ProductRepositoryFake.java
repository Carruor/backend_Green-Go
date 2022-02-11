package com.marketplace.GreenAndGo.repository;

import com.marketplace.GreenAndGo.model.Product;
import com.marketplace.GreenAndGo.model.Seller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductRepositoryFake implements ProductRepository{


    @Override
    public List<Product> getAll() {
        Seller seller1 = new Seller(1,"p","p@p.com");
        List <Product> productList = new ArrayList<Product>();
        Product product1 = new Product(333,"planta", "http://localhost:3000/media/planta1.jpg", "bonita", seller1, 15 );
        Product product2 = new Product(2,"plantaz", "http://localhost:3000/media/planta2.png", "bonitx", seller1, 15 );
        Product product3 = new Product(3,"plantax", "http://localhost:3000/media/planta3.jpg", "bonitz", seller1, 15 );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return productList;
    }

    @Override
    public Product getById(Integer id) {
        Seller seller1 = new Seller(1,"p","p@p.com");
        return new Product(222,"plantaById", "http://localhost:3000/media/planta3.jpg", "bonitaById", seller1, 15 );
    }

}
