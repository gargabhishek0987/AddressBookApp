package com.abhishek.AddressBook.AddressBookApp.repository;

import com.abhishek.AddressBook.AddressBookApp.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository  extends JpaRepository<Contact, Long> {
}
