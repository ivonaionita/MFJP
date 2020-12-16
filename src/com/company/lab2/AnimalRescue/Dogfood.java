package com.company.lab2.AnimalRescue;

public class Dogfood {
   private String name;
   private double price;
   private double qty;
   private boolean stock;

   public void setName( String name){
       this.name="Royal Canin";
   }
   public String getName(){
       return name;
   }

   public void setPrice( double price){
       this.price=10;
   }
   public double getPrice() {
       return price;
   }

    public void setQty( double qty){
        this.qty=10;
    }
    public double getQty() {
        return qty;
    }

    public void setStock(boolean stock){
       this.stock=true;
}
    public boolean getStock() {
        return stock;
    }
}

