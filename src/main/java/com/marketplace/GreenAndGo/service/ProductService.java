package com.marketplace.GreenAndGo.service;

import com.marketplace.GreenAndGo.model.Product;

import java.util.List;

public interface ProductService {
    public Product getById(int id);

    public List<Product> getAll();
}
