package com.company;


public class Main {

    public static void main(String[] args) {


        Pencil Pencil = new Pencil(.7,"Dixon", "Orange", false );
        Pencil pencil1 = new Pencil(.8, "paper-mate", true, "yellow", false );
        System.out.println("This is pencil:"+ Pencil.getColor());
        System.out.println("This is Pencil 1: " + pencil1.getColor());




    }
}
