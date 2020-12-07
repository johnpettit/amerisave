package com.xervanik.amerisave.repository;

import com.xervanik.amerisave.model.Contact;

import java.util.ArrayList;

//TODO add a backend DB
public class ContactRepository {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();
    private Integer idCounter = 1;  //TODO prefer to use UUIDs as ids

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

    //TODO some better error checking  Checking for dupes on email?
    public Contact addContact(Contact contact) {
        contact.setId(this.idCounter);
        idCounter++;
        this.contactList.add(contact);
        return contact;
    }

    //TODO some better error checking
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

    //TODO some better error checking
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
