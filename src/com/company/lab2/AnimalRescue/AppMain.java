package com.company.lab2.AnimalRescue;

import java.sql.SQLOutput;

public class AppMain {
    public static void main (String[]args)  {

        Dog mydog=new Dog();
        System.out.println(mydog.getName());
        System.out.println(mydog.getAge());
        System.out.println(mydog.getFood());
        System.out.println(mydog.getHappiness());
        System.out.println(mydog.getHealth());
        System.out.println(mydog.getHobby());
        System.out.println(mydog.getHunger());
        mydog.bark();
        mydog.sleep();

        Dog myotherdog=new Dog();
        myotherdog.setName("abcd");
        System.out.println(myotherdog.getName());


        Dogfood dryFood=new Dogfood();
        System.out.println(dryFood.getName());;

        Girl girlname=new Girl();
        System.out.println(girlname.getName());
        System.out.println(girlname.getMoney());

       Play favouriteplay=new Play();
        System.out.println(favouriteplay.getName());

        Vet missvet=new Vet();
        System.out.println(missvet.getName());
        System.out.println(missvet.getSpecialty());
    }
}
