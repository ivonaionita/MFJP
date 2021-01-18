package com.company.lab2.AnimalRescue;

public abstract class Cat extends Animal {
        public  void purr(){
                System.out.println("purrrrrr");
        }

        @Override
        public void respondTo() {
                System.out.println("hey kitty kitty");
        }
        public abstract void catSleepHours();
}

