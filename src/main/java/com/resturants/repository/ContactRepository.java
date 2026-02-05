package com.resturants.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.resturants.model.ContactMessage;

@Repository
public interface ContactRepository extends MongoRepository<ContactMessage, String> {
	
}
