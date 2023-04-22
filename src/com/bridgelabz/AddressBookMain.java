package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain extends AddressBook{
/*
 * Call method to Add Contact in Address Book(UC2)
 * Call method to edit existing contact person by using their First Name(UC3)
 * Call method to Delete existing contact person by using their First Name(UC4)
 * Add multiple Contact in Address Book(UC5)
 */
    public static void main(String[] args) {
        System.out.println(" *** Welcome To ADDRESS BOOK PROGRAM *** ");
//  Calling method
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        System.out.println("-----------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("---Address Book---");
            System.out.println("1. Add Contact \n2. Edit Contact \n3. Delete Contact \n4. Display Contact \n");
            System.out.println("Choose any Number : ");
//By Using Switch case Address Book Details are created.
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    System.out.println("Enter the First Name To Edit the Contact : ");
                    addressBook.editContact(scanner.next());
                    break;
                case 3:
                    System.out.println("Enter the First Name To Delete the Contact : ");
                    addressBook.deleteContact(scanner.next());
                    break;
                case 4:
                    System.out.println("Display all the Contacts: ");
                    addressBook.display();
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}

