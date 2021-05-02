package com.DanielBriones;

public class Phone extends Contact {

    private String phone_number;

    public Phone() {
        setContact();
    }

    public Phone(String type, String num){ // Consider different types.. 714-111-4242 vs 7141114242
        this.type = type;
        this.phone_number = num;
    }

    @Override
    void print() {
        System.out.println(getContact(true));
    }

    @Override
    String getContact(boolean full) { //Imported from C++, check to see if still works
        String contact = "(" + type + ") ";

        for (int i = 0; i < 10; i++){
            if(i==3){
                contact = contact + "-" + phone_number.charAt(3); //Print the first '-' and 4th number
                continue;
            }

            else if(i == 6){
                contact = contact + "-" + phone_number.charAt(6); //Print the second '-' and the 7th number
                continue;
            }

            contact = contact + phone_number.charAt(i); //Add number to the contact

        }

        if (!full) {
            return contact;
        }

        contact = "Phone: " + contact;

        return contact;
    }

    @Override
    void setContact() {
        System.out.println("Enter the type of phone number: ");
        type = input.next();
        System.out.println("Enter the phone number: ");
        phone_number = input.next();
    }

    @Override
    String getValue() {
        return phone_number;
    }
}
