package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
/*
    Create ArrayList of ContactPerson object called contact
    for store the contact of each person.
 */
    ArrayList<ContactPerson> contact = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void createContact() {
/*
    Creating Contacts for each person by Using Scanner method
 */
        ContactPerson contactPerson = new ContactPerson();
        System.out.print("Enter the First Name : ");
        contactPerson.setFirstName(scanner.nextLine());
        System.out.print("Enter the Last Name : ");
        contactPerson.setLastName(scanner.nextLine());
        System.out.print("Enter the Address : ");
        contactPerson.setAddress(scanner.nextLine());
        System.out.print("Enter the City : ");
        contactPerson.setCity(scanner.nextLine());
        System.out.print("Enter the State : ");
        contactPerson.setState(scanner.nextLine());
        System.out.print("Enter the Zip Code : ");
        contactPerson.setZip(scanner.nextLine());
        System.out.print("Enter the PhoneNumber : ");
        contactPerson.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter the Email id : ");
        contactPerson.setEmail(scanner.nextLine());
        contact.add(contactPerson);
    }
    public void addContact(){
/*
    To Print the ArrayList of Contact
 */
        System.out.println(contact);
        System.out.println("Contact Added Successfully");

    }
}
