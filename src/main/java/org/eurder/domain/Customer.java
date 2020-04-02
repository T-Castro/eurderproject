package org.eurder.domain;

public class Customer {

    private final String FirstName;
    private final String LastName;
    private final String EmailAddress;
    private final String Address;
    private final String PhoneNumber;

    public Customer(String firstName, String lastName, String emailAddress, String address, String phoneNumber) {
        FirstName = firstName;
        LastName = lastName;
        EmailAddress = emailAddress;
        Address = address;
        PhoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void createAnAccount(){

    }

    public Items orderAnItem(){
        return null;
    }

    public Orders seeAllMyOrders(){
        return null;
    }

    public void reorderOneOfPreviousOrders(){

    }


}
