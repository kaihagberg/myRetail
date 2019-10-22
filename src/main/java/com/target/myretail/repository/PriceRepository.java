package com.target.myretail.repository;

import com.target.myretail.model.Price;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PriceRepository extends MongoRepository<Price, String> {
	Price findPriceById(String id);
}
