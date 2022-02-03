package com.marketplace.GreenAndGo.repository;


import com.marketplace.GreenAndGo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepository {
    public List<Product> getAll();
    public Product getById(Integer id);
}
