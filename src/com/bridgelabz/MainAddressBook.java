package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAddressBook {
    public static void main(String[] args) {
        String firstName=null;
        String lastName=null;
        String address=null;
        String city=null;
        String state=null;
        int zipCode=0;
        String eMail=null;
        long phoneNumber=0;
        AddressBook adding=new AddressBook(firstName, lastName, address, city, state, zipCode, eMail, (int) phoneNumber);
        ArrayList<AddressBook> fillContact = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(".................Welcome to AddressBook Program...................");

        int choice;
        do {
            System.out.println("1)INSERT");
            System.out.println("2)DISPLAY");
            System.out.println("3)EDIT");
            System.out.println("4)DELETE");
            System.out.println("0) EXIT");
            System.out.println("Enter your Choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    adding.addContact();
                    break;

                case 2:
                    adding.display();
                    break;

                case 3:
                    adding.editing();
                    break;

                case 4:
                    adding.deleting();
                    break;

            }
        }while (choice !=0);
    }
}


