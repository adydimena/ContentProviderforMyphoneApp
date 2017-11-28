package com.example.ady.contentproviderformyphoneapp;

/**
 * Created by Ady on 11/27/2017.
 */

public class MyContacts {
    String Name;
    String Number;
    String Email;
    String Address;
    String Sport;

    public MyContacts(String name, String number, String email, String address, String sport) {
        Name = name;
        Number = number;
        Email = email;
        Address = address;
        Sport = sport;
    }

    public String getName() {
        return Name.toUpperCase();
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getEmail() {
        return Email.toUpperCase();
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address.toUpperCase();
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getSport() {
        return Sport.toUpperCase();
    }

    public void setSport(String sport) {
        Sport = sport;
    }
}
