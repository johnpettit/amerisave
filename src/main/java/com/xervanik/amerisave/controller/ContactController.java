package com.xervanik.amerisave.controller;

import com.xervanik.amerisave.model.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ContactController {
    private Integer idCounter = 1;

    @GetMapping("/contact")
    public ArrayList<Contact> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Contact c1 = new Contact(idCounter, "John", "Pettit", "jp@gmail.com");
        idCounter++;
        Contact c2 = new Contact(idCounter, "Fred", "Smith", "fs@gmail.com");
        idCounter++;
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(c1);
        contacts.add(c2);
        return contacts;
    }

}
