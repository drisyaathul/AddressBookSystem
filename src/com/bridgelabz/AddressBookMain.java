package com.bridgelabz;

public class AddressBookMain {
    // Calling method of Create Contact
    public static void main(String[] args) {
        System.out.println(" *** Welcome To ADDRESS BOOK PROGRAM *** ");

        AddressBook addressBook = new AddressBook();
        addressBook.CreateContact();
    }
}
