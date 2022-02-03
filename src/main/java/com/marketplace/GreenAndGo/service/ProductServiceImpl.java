package com.marketplace.GreenAndGo.service;

import com.marketplace.GreenAndGo.model.Product;
import com.marketplace.GreenAndGo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getById(int id) {

        return productRepository.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
