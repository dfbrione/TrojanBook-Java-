package com.DanielBriones;

import java.util.Scanner;

public class Person {

    private String f_name, l_name;
    Scanner input;


    public Person() { //Default Constructor
        this.f_name = "Ronald";
        this.l_name = "McDonald";
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setPerson(){
        input = new Scanner(System.in);
        System.out.println("First name: ");
        f_name = input.nextLine();
        System.out.println("Last name: ");
        l_name = input.nextLine();
        System.out.println("Birthday (M/D/YYYY): ");

    }
}
