package com.bridgelabz;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    String eMail;
    int phoneNumber;

    public AddressBook(String firstName, String lastName, String address, String city, String state, int zipCode, String eMail, int phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
        this.eMail=eMail;
        this.phoneNumber=phoneNumber;
    }
    public String toString(){
        return "AddressBook{" + ", firstName='" + firstName + '\''+ ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zipCode=" + zipCode + ", eMail='" + eMail + '\'' + ", phoneNumber=" + phoneNumber + '}';
    }
}
