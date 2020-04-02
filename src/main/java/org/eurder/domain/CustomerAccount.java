package org.eurder.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerAccount {

    private final String FirstName;
    private final String LastName;
    private final String EmailAddress;
    private final String Address;
    private final String PhoneNumber;
    private List<Orders> ordersByCustomer;

    public CustomerAccount(String firstName, String lastName, String emailAddress, String address, String phoneNumber) {
        FirstName = firstName;
        LastName = lastName;
        EmailAddress = emailAddress;
        Address = address;
        PhoneNumber = phoneNumber;
        ordersByCustomer= new ArrayList<>();
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



   /* public Items orderAnItem(){
        return null;
    }

    public List<Orders> seeAllMyOrders(){
        ordersByCustomer= new ArrayList<>();
        return ordersByCustomer;
    }

    public void reorderOneOfPreviousOrders(){

    }*/


}
