package com.company.lab2.AnimalRescue;

public class Animal {
    private String  name;
    private int age;
    private int health;
    private int hunger;
    private int happiness;
    private String food;
    private String hobby ;



    public void setName(String name){

        this.name=name;
    }
    public String getName()
    {
        return name;
    }


    public void setAge(int age){

        this.age= age;
    }
    public int getAge(){
        return age;
    }


    public void sethealth(int health){
        this.health=health;
    }
    public int getHealth(){
        return health;
    }

    public void setHunger(int hunger){
        this.hunger=hunger;
    }
    public int getHunger(){
        return hunger;
    }

    public void setHappiness(int happiness){
        this.happiness=happiness;
    }
    public int getHappiness() {
        return happiness;
    }

    public void setFood(String food){
        this.food=food;
    }
    public String getFood() {
        return food;
    }

    public void setHobby(String hobby){
        this.hobby=hobby;
    }
    public String getHobby(){
        return hobby;
    }
}
