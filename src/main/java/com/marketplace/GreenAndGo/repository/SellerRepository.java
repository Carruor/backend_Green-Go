package com.marketplace.GreenAndGo.repository;


import com.marketplace.GreenAndGo.model.Product;
import com.marketplace.GreenAndGo.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface SellerRepository {
    public List<Seller> getAll();
    public Seller getById(Integer id);
}
