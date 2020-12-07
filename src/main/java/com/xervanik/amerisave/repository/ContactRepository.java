package com.xervanik.amerisave.repository;

import com.xervanik.amerisave.model.Contact;

import java.util.ArrayList;

public class ContactRepository {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();
    private Integer idCounter = 1;

    public ContactRepository() {
    }

    public Contact getOneContact(Integer id) {
        for(Contact contact: contactList) {
            if(contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }

    public ArrayList<Contact> getAllContacts() {
        return this.contactList;
    }

    public Contact addContact(Contact contact) {
        contact.setId(this.idCounter);
        idCounter++;
        this.contactList.add(contact);
        return contact;
    }

    public void editContact(Contact eContact) {
        for(Contact contact: contactList) {
            if(contact.getId() == eContact.getId()) {
                if(findIndex(contact) == -1) {
                    return;
                }
                contactList.set(findIndex(contact),eContact);
            }
        }
    }

    public void removeContact(Integer id) {
        for(Contact contact: contactList) {
            if(contact.getId() == id) {
                Integer index = findIndex(contact);
                if(index == -1) {
                    return;
                }
                contactList.remove(contactList.get(index));
            }
        }
    }

    private Integer findIndex(Contact contact) {
        for(int x = 0; x < contactList.size(); x++) {
            if(contact.getId() == contactList.get(x).getId()) {
                return x;
            }
        }
        return -1;
    }
}
