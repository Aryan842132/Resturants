package com.resturants.services;

import org.springframework.stereotype.Service;

import com.resturants.model.ContactMessage;
import com.resturants.repository.ContactRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContactService {
	
    private final ContactRepository repo;
    
    public ContactMessage save(ContactMessage booking) {
        return repo.save(booking);
    }
}