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

        int choice;
        do {
            System.out.println("1)INSERT");
            System.out.println("2)DISPLAY");
            System.out.println("3)EDIT");
            System.out.println("0) EXIT");
            System.out.println("Enter your Choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter FirstName:");
                    String firstName=sc1.nextLine();

                    System.out.print("Enter LastName:");
                    String lastName=sc1.nextLine();

                    System.out.print("Enter Address:");
                    String address=sc1.nextLine();

                    System.out.print("Enter the City:");
                    String city=sc1.nextLine();

                    System.out.print("Enter the State:");
                    String state=sc1.nextLine();

                    System.out.print("Enter the ZipCode:");
                    int zipCode=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the E-mail:");
                    String eMail=sc1.nextLine();

                    System.out.print("Enter Phone Number:");
                    int phoneNumber=sc.nextInt();

                    fillContact.add(new AddressBook(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber));
                    break;
                case 2:
                    Iterator<AddressBook> displayContacts = fillContact.iterator();
                    while (displayContacts.hasNext()) {
                        AddressBook show = displayContacts.next();
                        System.out.println(show);
                    }
                    break;
                case 3:
                    boolean found = false;
                    Iterator<AddressBook> editingMood = fillContact.iterator();

                    System.out.println("Enter the FirstName for editing :");
                    firstName = sc1.nextLine();
                    while (editingMood.hasNext()) {
                        AddressBook data = editingMood.next();
                        if ((data.firstName).equals(firstName)) {
                            int index = fillContact.indexOf(data);
                            lastName = data.lastName;
                            System.out.println("Enter the new Address");
                            address = sc1.nextLine();

                            System.out.println("Enter the new city :");
                            city = sc1.nextLine();

                            System.out.println("Enter the new State :");
                            state = sc1.nextLine();

                            System.out.println("Enter the new Zipcode :");
                            zipCode = sc.nextInt();

                            System.out.println("Enter the new Email-id :");
                            eMail = sc1.nextLine();

                            System.out.println("Enter the new Phone number :");
                            phoneNumber = sc.nextInt();

                            fillContact.set(index, new AddressBook(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("not found");
                    } else
                        System.out.println("edited successfully");
            }
        }while (choice !=0);
    }
}


