package com.company.lab2.AnimalRescue;

 public abstract class Human {
    private String name;
    private double money;
    private String nationality;


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setMoney(double money){
        this.money=money;
    }
    public double getMoney() {
        return money;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public abstract void sayHello();


}

