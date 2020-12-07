package com.xervanik.amerisave.model;

public class Contact {
    //Contact class
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public Contact() {

    }

    public Contact(String fName, String lName, String emailNew) {
        this.id = id = -1;
        this.firstName = fName;
        this.lastName = lName;
        this.email = emailNew;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
