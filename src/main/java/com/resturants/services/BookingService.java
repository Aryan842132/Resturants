package com.resturants.services;

import org.springframework.stereotype.Service;

import com.resturants.model.TableBooking;
import com.resturants.repository.TableBookingRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookingService {
	
    private final TableBookingRepository repo;
    
    public TableBooking save(TableBooking booking) {
        return repo.save(booking);
    }
}
