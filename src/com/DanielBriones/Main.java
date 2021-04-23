package com.DanielBriones;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Person Daniel = new Person ();
        System.out.println(Daniel.getF_name() + " " + Daniel.getL_name());
        Date sample = new Date(3, 28, 1999);
        sample.PrintDate("M/D/YYYY");

    }
}
