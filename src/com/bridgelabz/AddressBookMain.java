package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println(" *** Welcome To ADDRESS BOOK PROGRAM *** ");
//  Calling method to Add Contact in Address Book
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
//Call method to edit existing contact person using their First Name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name To Edit : ");
        String firstName = scanner.next();
        addressBook.editContact(firstName);
        addressBook.display();
    }
}
