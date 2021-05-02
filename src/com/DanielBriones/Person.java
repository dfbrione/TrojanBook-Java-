package com.DanielBriones;

//NEEDS contacts ArrayList

import java.util.Scanner;

public class Person {

    private String f_name, l_name;
    private Date birthday;
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

    @Override
    public String toString() {
       return f_name + " " + l_name + " with birthday ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Person other = (Person) obj; //Cast object as person object

        return this.f_name.equals(other.f_name) && (this.l_name.equals(other.l_name)); //Will return true if attributes are same, False if not same
    }
}
