package com.abhishek.AddressBook.AddressBookApp.repository;

import com.abhishek.AddressBook.AddressBookApp.entities.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Long> {

}
