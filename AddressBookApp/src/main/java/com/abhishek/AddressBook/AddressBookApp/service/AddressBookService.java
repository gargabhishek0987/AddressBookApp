package com.abhishek.AddressBook.AddressBookApp.service;

import com.abhishek.AddressBook.AddressBookApp.entities.AddressBook;
import com.abhishek.AddressBook.AddressBookApp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressBookService {
    @Autowired
    private AddressBookRepository addressBookRepository;

    //saveadressBook
    public AddressBook saveAddressBook(AddressBook addressBook) {
        return addressBookRepository.save(addressBook);
    }

    //get all addressbook
    public AddressBook getAddressBookById(Long id){
        return addressBookRepository.findById(id).get();
        //                .orElseThrow(() -> new RuntimeException("AddressBook not found with id : "+id));

    }

    //update AddressBookApp

    public AddressBook updateAddressBook(Long id , AddressBook updateAddressBook){
        AddressBook addressBook = getAddressBookById(id);
        addressBook.setName(updateAddressBook.getName());
        return addressBookRepository.save(addressBook);
    }

    //DElete AddrrwessBook
    public void deleteAddressBook(Long id ){
        addressBookRepository.deleteById(id);
    }
}
