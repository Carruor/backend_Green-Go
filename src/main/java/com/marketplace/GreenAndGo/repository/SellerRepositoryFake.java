package com.marketplace.GreenAndGo.repository;

import com.marketplace.GreenAndGo.model.Seller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SellerRepositoryFake implements SellerRepository{
    @Override
    public List<Seller> getAll() {
        List <Seller> sellerList = new ArrayList<Seller>();
        Seller seller1 = new Seller(1, "PenguinShop", "penguin@penguin.com");
        Seller seller2 = new Seller(2, "PepitoShop", "pepito@pepito.com");
        Seller seller3 = new Seller(3, "CradaShop", "crada@crada.com");
        sellerList.add(seller1);
        sellerList.add(seller2);
        sellerList.add(seller3);
        return sellerList;
    }

    @Override
    public Seller getById(Integer id) {
        return new Seller(4, "itCrowdShop", "itcrowd@itcrowd.com");
    }

}
