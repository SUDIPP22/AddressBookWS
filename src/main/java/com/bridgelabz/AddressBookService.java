package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Purpose : To create address book
 *
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-10-11
 */
public class AddressBookService {
    public static void main(String[] args) {
        System.out.println("Welcome To The Address Book Program");
        AddressBookService addressBookService = new AddressBookService();
        addressBookService.createContact();
    }

    /**
     * Purpose : To take all the details of contact person
     */
    public void createContact() {
        Contacts contacts = new Contacts();
        contacts.setFirstName("Sudip");
        contacts.setLastName("Panja");
        contacts.setAddress("1/A/7");
        contacts.setCity("Kolkata");
        contacts.setState("WestBengal");
        contacts.setZip(700050);
        contacts.setPhoneNumber(891021137);
        contacts.setEmail("panja370@gmail.com");
    }

    /**
     * Purpose : To validate user details
     *
     * @param name : taking user's name
     * @return the matching value
     */
    public boolean validateName(String name) {
        Contacts contacts = new Contacts();
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(contacts.getFirstName());
        boolean b = matcher.matches();
        if (contacts.getFirstName().isEmpty())
            return false;
        return b;
    }
}
