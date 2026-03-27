package com.abhishek.AddressBook.AddressBookApp.controller;


import com.abhishek.AddressBook.AddressBookApp.entities.AddressBook;
import com.abhishek.AddressBook.AddressBookApp.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressBook")
public class AddressBookController {


    @Autowired
    private AddressBookService addressBookService;

    @PostMapping
    public AddressBook createAddressBook(@RequestBody AddressBook addressBook) {
        return addressBookService.saveAddressBook(addressBook);
    }

    // Get Address Book By Id
    @GetMapping("/{id}")
    public AddressBook getAddressBookById(@PathVariable Long id) {
        return addressBookService.getAddressBookById(id);
    }

    // Update Address Book
    @PutMapping("/{id}")
    public AddressBook updateAddressBook(@PathVariable Long id, @RequestBody AddressBook addressBook) {
        return addressBookService.updateAddressBook(id, addressBook);
    }

    // Delete Address Book
    @DeleteMapping("/{id}")
    public void deleteAddressBook(@PathVariable Long id) {
        addressBookService.deleteAddressBook(id);
    }


    @GetMapping("/sum/{id}/{id2}")
    public int sumresponse(@PathVariable int id , @PathVariable int id2){return id + id2;
    }
}
