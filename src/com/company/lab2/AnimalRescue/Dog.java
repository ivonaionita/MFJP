package com.company.lab2.AnimalRescue;

public class Dog {
   private String  name;
   private int age;
   private int health;
   private int hunger;
   private int happiness;
   private String food;
   private String hobby ;

    void bark(){
        System.out.println("Ham");
    }

    void sleep(){
        System.out.println("zzzzzzZZZZZzzzz");
    }

    public void setName(String name){
        this.name="Jessie";
    }
    public String getName(){
         return name;
    }


    public void setAge(int age){
        this.age= 3;
    }
    public int getAge(){
        return age;
    }


    public void sethealth(int health){
        this.health=10;
    }
    public int getHealth(){
        return health;
    }

    public void setHunger(int hunger){
        this.hunger=5;
    }
    public int getHunger(){
        return hunger;
    }

    public void setHappiness(int happiness){
        this.happiness=9;
    }
    public int getHappiness() {
        return happiness=happiness;
    }

    public void setFood(String food){
        this.food="Royal Canin";
    }
    public String getFood() {
        return food;
    }

    public void setHobby(String hobby){
        this.hobby="Catching the ball";
    }
    public String getHobby(){
        return hobby;
    }
}

