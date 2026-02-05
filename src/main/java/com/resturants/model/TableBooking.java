package com.resturants.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "table_bookings")
@Data
public class TableBooking {

    @Id
    private String id;
    private String fullName;
    private String email;
    private int guests;
    private String date;
    private String time;
    private String specialRequest;
}
