package com.bridgelabz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class AddressBook {
    Scanner sc=new Scanner(System.in);
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    String emailId;
    long phoneNumber;

    public AddressBook(String firstName, String lastName, String address, String city, String state, String emailId, int zipCode, int phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
        this.emailId=emailId;
        this.phoneNumber=phoneNumber;
    }
    ArrayList<AddressBook> fillContact=new ArrayList<>();

    public void addContact(){
        System.out.print("Enter your Firstname :");
        firstName=sc.nextLine();

        System.out.print("Enter your LastName :");
        lastName=sc.nextLine();

        System.out.println("Enter the new Address");
        address = sc.nextLine();

        System.out.println("Enter the new city :");
        city = sc.nextLine();

        System.out.println("Enter the new State :");
        state = sc.nextLine();

        System.out.println("Enter the new Zipcode :");
        zipCode = sc.nextInt();

        System.out.println("Enter the new Email-id :");
        emailId = sc.nextLine();

        System.out.println("Enter the new Phone number :");
        phoneNumber = sc.nextInt();
        sc.nextLine();
        fillContact.add(new AddressBook(firstName,lastName,address,city,state,emailId,zipCode, (int) phoneNumber));
    }

    public void display(){

        Iterator<AddressBook> displayContact=fillContact.iterator();

        while(displayContact.hasNext()){
            AddressBook show=displayContact.next();
            System.out.println(show);
        }

        if(displayContact.hasNext()==false){
            System.out.println("Their is no Details to display! ");
        }
    }
    public String toString(){
        return "AddressBook{" + ", firstName='" + firstName + '\''+ ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zipCode=" + zipCode + ", emailId='" + emailId + '\'' + ", phoneNumber=" + phoneNumber + '}';
    }
}
