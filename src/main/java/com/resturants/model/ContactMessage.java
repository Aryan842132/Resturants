package com.resturants.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "contact_messages")
@Data
public class ContactMessage {

    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private String message;
}
