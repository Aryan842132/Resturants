package com.resturants.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "order_bookings")
@Data
public class OrderBooking {

    @Id
    private String id;
    private String name;
    private String tableNo;
    private String itemName;
    private int quantity;
    private String phoneNumber;
}
