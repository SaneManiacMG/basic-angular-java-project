package com.java.backend.fullstack.model;

public class Customers {
    private String firstName;
    private String lastName;

    public Customers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected Customers() {
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

    @Override
    public String toString() {
        return "Customers{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
