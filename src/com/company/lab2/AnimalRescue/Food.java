package com.company.lab2.AnimalRescue;

public class Food {
    private String name;
    private double price;
    private double qty;
    private boolean stock;

    public void setName( String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setPrice( double price){
        this.price=price;
    }
    public double getPrice() {
        return price;
    }

    public void setQty( double qty){
        this.qty=qty;
    }
    public double getQty() {
        return qty;
    }

    public void setStock(boolean stock){
        this.stock=stock;
    }
    public boolean getStock() {
        return stock;
    }
}
