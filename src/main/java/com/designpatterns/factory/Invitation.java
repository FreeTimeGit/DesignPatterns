package com.designpatterns.factory;

public class Invitation {

    private String name;
    private String surname;
    private String address;

    public Invitation(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

}
