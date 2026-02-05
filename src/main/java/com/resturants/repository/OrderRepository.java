package com.resturants.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.resturants.model.OrderBooking;

@Repository
public interface OrderRepository extends MongoRepository<OrderBooking, String> {
	
}
