package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainAddressBook {
    public static void main(String[] args) {
        ArrayList<AddressBook> fillContact = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Welcome to AddressBook");

        int choice = -1;
        do {
            System.out.println("1)INSERT");
            System.out.println("2)DISPLAY");
            System.out.println("0) EXIT");
            System.out.println("Enter your Choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter FirstName:");
                    String firstName = sc1.nextLine();

                    System.out.print("Enter LastName:");
                    String lastName = sc1.nextLine();

                    System.out.print("Enter Address:");
                    String address = sc1.nextLine();

                    System.out.print("Enter the City:");
                    String city = sc1.nextLine();

                    System.out.print("Enter the State:");
                    String state = sc1.nextLine();

                    System.out.print("Enter the ZipCode:");
                    int zipCode = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the E-mail:");
                    String eMail = sc1.nextLine();

                    System.out.print("Enter Phone Number:");
                    int phoneNumber = sc.nextInt();

                    AddressBook addressBook = new AddressBook(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber);
                    break;
                case 2:
                    Iterator<AddressBook> displayContacts=fillContact.iterator();
                    while (displayContacts.hasNext()){
                        AddressBook show=displayContacts.next();
                        System.out.println(show);
                    }
                    break;
            }
        }while (choice !=0);
    }
}


