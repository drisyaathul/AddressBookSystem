package com.bridgelabz;

public class AddressBook {

    public void CreateContact() {
        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setFirstName("Drisya");
        contactPerson.setLastName("Athul");
        contactPerson.setAddress("Edhas House");
        contactPerson.setCity("Perak");
        contactPerson.setState("Kuala Lumpur");
        contactPerson.setZip("320011");
        contactPerson.setPhoneNumber("985478996625");
        contactPerson.setEmail("drisya809@gmail.com");

        System.out.println("First Name : " + contactPerson.getFirstName());
        System.out.println("Second Name : " + contactPerson.getLastName());
        System.out.println("Address : " + contactPerson.getAddress());
        System.out.println("City : " + contactPerson.getCity());
        System.out.println("State : " + contactPerson.getState());
        System.out.println("Zip Code : " + contactPerson.getZip());
        System.out.println("Phone Number : " + contactPerson.getPhoneNumber());
        System.out.println("E-Mail : " + contactPerson.getEmail());
    }
}
