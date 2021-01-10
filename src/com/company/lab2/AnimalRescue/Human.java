package com.company.lab2.AnimalRescue;

public class Human {
    private String name;
    private double money;
    private String nationality;

    public void whereAreyouFrom(){
        System.out.print("i'm from Romania");
    }

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

}

