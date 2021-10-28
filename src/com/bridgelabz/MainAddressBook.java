package com.bridgelabz;

import java.util.Scanner;

public class MainAddressBook {
        public static void main(String[] args) {

            System.out.println("Welcome to AddressBook");

            Scanner userInput=new Scanner(System.in);

            System.out.print("Enter FirstName:");
            String firstName=userInput.nextLine();

            System.out.print("Enter LastName:");
            String lastName=userInput.nextLine();

            System.out.print("Enter Address:");
            String address=userInput.nextLine();

            System.out.print("Enter the City:");
            String city=userInput.nextLine();

            System.out.print("Enter the State:");
            String state=userInput.nextLine();

            System.out.print("Enter the ZipCode:");
            int zipCode=userInput.nextInt();
            userInput.nextLine();

            System.out.print("Enter the E-mail:");
            String eMail=userInput.nextLine();

            System.out.print("Enter Phone Number:");
            int phoneNumber=userInput.nextInt();

            AddressBook addressBook=new AddressBook(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber );
        }
    }

