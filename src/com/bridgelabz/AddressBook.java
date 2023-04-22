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

    public void addContact() {
/*
  * Creating Contacts for each person by Using Scanner method
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
    public void editContact(String searchFirstName) {
 /*
    * To Edit Existing Contact Person by Searching their First Name
    * By using if Loop, details of the existing contact will print
    * By using Switch Case, Updates the existing contact Person
 */
        for (ContactPerson contactPerson : contact) {
            String firstName = contactPerson.getFirstName();
            if (firstName.equals(searchFirstName)) {
                System.out.println("Contact Details of "+searchFirstName+" :-");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City \n5. State \n6. Zip Code \n7. Phone Number \n8. Email Id \n");
                System.out.println("Enter your Choice which you want to Edit :- ");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Update the First Name :");
                        String updatedFirstName = scanner.next();
                        contactPerson.setFirstName(updatedFirstName);
                        System.out.println("First Name is UPDATED");
                        break;
                    case 2:
                        System.out.println("Update the Last Name :");
                        String updatedLastName = scanner.next();
                        contactPerson.setLastName(updatedLastName);
                        System.out.println("Last Name is UPDATED");
                        break;
                    case 3:
                        System.out.println("Update the Address :");
                        String updatedAddress = scanner.next();
                        contactPerson.setAddress(updatedAddress);
                        System.out.println("Address is UPDATED");
                        break;
                    case 4:
                        System.out.println("Update the City :");
                        String updatedCity = scanner.next();
                        contactPerson.setCity(updatedCity);
                        System.out.println("City is UPDATED");
                        break;
                    case 5:
                        System.out.println("Update the State :");
                        String updatedState = scanner.next();
                        contactPerson.setState(updatedState);
                        System.out.println("State is UPDATED");
                        break;
                    case 6:
                        System.out.println("Update the Zip :");
                        String updatedZip = scanner.next();
                        contactPerson.setZip(updatedZip);
                        System.out.println("Zip Code is UPDATED");
                        break;
                    case 7:
                        System.out.println("Update the Phone Number :");
                        String updatedPhoneNumber = scanner.next();
                        contactPerson.setPhoneNumber(updatedPhoneNumber);
                        System.out.println("Phone Number is UPDATED");
                        break;
                    case 8:
                        System.out.println("Update the Email Id :");
                        String updatedEmailId = scanner.next();
                        contactPerson.setEmail(updatedEmailId);
                        System.out.println("Email Id is UPDATED");
                        break;
                    default:
                        System.out.println("INVALID CHOICE");
                    }
                }
            else
                System.out.println("NO RECORD FOUND !");
            }
        }
        public void display(){
            // To print the ArrayList of Contact
            System.out.println(contact);
        }
    }
