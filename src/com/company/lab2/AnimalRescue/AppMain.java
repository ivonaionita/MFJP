package com.company.lab2.AnimalRescue;

import java.sql.SQLOutput;

public class AppMain {
    public static void main (String[]args)  {

        Dog mydog=new Dog();
        System.out.println(mydog.name);
        System.out.println(mydog.age);
        System.out.println(mydog.food);
        System.out.println(mydog.hapiness);
        System.out.println(mydog.health);
        System.out.println(mydog.hobby);
        System.out.println(mydog.hunger);
        mydog.bark();
        mydog.sleep();

        Dog myotherdog=new Dog();
        myotherdog.name="Rex";
        System.out.println(myotherdog.name);


        Dogfood dryfood=new Dogfood();
        System.out.println(dryfood.name);
        System.out.println(dryfood.price);
        System.out.println(dryfood.qty);
        System.out.println(dryfood.stock);

        Girl girlname=new Girl();
        System.out.println(girlname.name);
        System.out.println(girlname.money);

        Play favouriteplay=new Play();
        System.out.println(favouriteplay.name);

        Vet missvet=new Vet();
        System.out.println(missvet.name);
        System.out.println(missvet.specialty);
    }
}
