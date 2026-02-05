package com.resturants.services;

import org.springframework.stereotype.Service;

import com.resturants.model.OrderBooking;
import com.resturants.repository.OrderRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	
    private final OrderRepository repo;
    
    public OrderBooking save(OrderBooking booking) {
        return repo.save(booking);
    }
}
