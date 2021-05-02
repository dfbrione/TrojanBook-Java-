package com.DanielBriones;
import java.util.Scanner;

public abstract class Contact {

    protected String type;
    protected Scanner input;

    abstract void print();
    abstract String getContact (boolean full);
    abstract void setContact();
    abstract String getValue();


}
