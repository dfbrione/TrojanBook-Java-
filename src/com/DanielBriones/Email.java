package com.DanielBriones;

public class Email extends Contact {

    private String email_addr;

    public Email() {
        setContact();
    }

    public Email(String type, String email_address){
        this.type = type;
        this.email_addr = email_address;
    }

    @Override
    void print() {
        System.out.println(getContact(true));
    }

    @Override
    String getContact(boolean full) {
        if (full){
            return "Email: (" + type + ") " + email_addr;
        }

        else{
            return type + ") " + email_addr;
        }
    }

    @Override
    void setContact() {
        System.out.println("Please enter the type of email address: ");
        type = input.next();
        System.out.println("Enter the email address: ");
        email_addr = input.next();
    }

    @Override
    String getValue() {
        return email_addr;
    }
}
