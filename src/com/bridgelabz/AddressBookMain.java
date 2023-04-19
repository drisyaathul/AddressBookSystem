package com.bridgelabz;

public class AddressBookMain
        public static void main(String[] args) {
        System.out.println(" *** Welcome To ADDRESS BOOK PROGRAM *** ");
//  Calling method
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.display();
    }
}
