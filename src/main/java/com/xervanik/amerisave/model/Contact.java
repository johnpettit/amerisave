package com.xervanik.amerisave.model;

public class Contact {
    //Contact class
    private Integer id;  //Prefer UUIDs as Ids
    private String firstName;
    private String lastName;
    private String email;

    public Contact() {

    }

    public Contact(String fName, String lName, String emailNew) {
        this.id = id = -1;  //Might cause issues A non added to repo Contact has a wonky id
        this.firstName = fName;
        this.lastName = lName;
        this.email = emailNew;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
