package com.resturants.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.resturants.model.TableBooking;

@Repository
public interface TableBookingRepository extends MongoRepository<TableBooking, String> {
	
}

