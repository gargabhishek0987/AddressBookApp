package com.abhishek.AddressBook.AddressBookApp.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "address_book")
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
