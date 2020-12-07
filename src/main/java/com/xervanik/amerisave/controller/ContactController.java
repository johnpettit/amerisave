package com.xervanik.amerisave.controller;

import com.xervanik.amerisave.model.Contact;
import com.xervanik.amerisave.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ContactController {
    private ContactRepository contactRepository = new ContactRepository();

    @GetMapping("/contact")
    public ArrayList<Contact> getAll() {
        return contactRepository.getAllContacts();
    }

    @GetMapping("/contact/{id}")
    public Contact getOne(@PathVariable Integer id) {
        Contact contact = contactRepository.getOneContact(id);
        return contact;
    }

    @PostMapping("/contact")
    public Contact createContact(@RequestBody Contact contact) {
        Contact newContact = contactRepository.addContact(contact);

        return newContact;
    }

    @PutMapping("/contact")
    public String editContact(@RequestBody Contact contact) {
        contactRepository.editContact(contact);
        return "{\"message\":\"success\"}";
    }

    @DeleteMapping("/contact/{id}")
    public String deleteContact(@PathVariable Integer id) {
        contactRepository.removeContact(id);
        return "{\"message\":\"success\"}";
    }
}
