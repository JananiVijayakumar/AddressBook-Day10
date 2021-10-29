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

    public AddressBook(String firstName, String lastName, String address, String city, String state, int zipCode, String emailId, int phoneNumber){
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
        fillContact.add(new AddressBook(firstName,lastName,address,city,state,zipCode,emailId, (int) phoneNumber));
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

    public void editing(){

        boolean found=false;

        Iterator <AddressBook> editContact=fillContact.iterator();

        System.out.println("Enter FirstName for Editing : ");
        firstName=sc.nextLine();

        while(editContact.hasNext()) {
            AddressBook data = editContact.next();

            if ((data.firstName).equals(firstName)) {
                int index= fillContact.indexOf(data);

                System.out.println("...............Enter the details for Editing....................");
                System.out.println("1.LastName");
                System.out.println("2.Address");
                System.out.println("3.City");
                System.out.println("4.State");
                System.out.println("5.ZipCode");
                System.out.println("6.Email-Id");
                System.out.println("7.Phone Number");

                System.out.println("Enter your Choice for Editing");
                int editChoice=sc.nextInt();
                sc.nextLine();

                switch(editChoice) {
                    case 1:
                        System.out.println("Enter your New LastName : ");
                        lastName = sc.nextLine();
                        break;
                    case 2:
                        System.out.println("Enter your new Address : ");
                        address = sc.nextLine();
                        break;
                    case 3:
                        System.out.println("Enter your new City : ");
                        city = sc.nextLine();
                        break;
                    case 4:
                        System.out.println("Enter your New State : ");
                        state = sc.nextLine();
                        break;
                    case 5:
                        System.out.println("Enter your new ZipCode : ");
                        zipCode= sc.nextInt();
                        sc.nextLine();
                        break;
                    case 6:
                        System.out.println("Enter your new Email-id : ");
                        emailId = sc.nextLine();
                        break;
                    case 7:
                        System.out.println("Enter your new Phone Number");
                        phoneNumber= sc.nextLong();
                        sc.nextLine();

                }
                fillContact.set(index, new AddressBook(firstName, lastName, address, city, state, zipCode, emailId, (int) phoneNumber));

                found = true;

            }
        }

        if (!found){
            System.out.println("Detail not found!");
        }
        else
            System.out.println("New Details Edited successfully!");
    }

    public void deleting(){

        boolean deleteItemFound=false;

        Iterator <AddressBook> deleteContact=fillContact.iterator();

        System.out.println("Enter your FirstName for Deleting : ");
        String nameSearch=sc.nextLine();

        while(deleteContact.hasNext()){
            AddressBook dataD=deleteContact.next();
            if(nameSearch.equals(dataD.firstName)){
                deleteContact.remove();
                deleteItemFound=true;
            }
        }

        if(!deleteItemFound){
            System.out.println("Deleted item not found!");
        }
        else
            System.out.println("Deleted successfully!");
    }
    public String toString(){
        return "AddressBook{" + ", firstName='" + firstName + '\''+ ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zipCode=" + zipCode + ", emailId='" + emailId + '\'' + ", phoneNumber=" + phoneNumber + '}';
    }
}
