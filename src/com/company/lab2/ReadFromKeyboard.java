package com.company.lab2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadFromKeyboard {

    public int readInt() {
        int x = 0;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("introdu o valoare");
            try {
                x = scanner.nextInt();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public float readFloat() {
        float x = 0.0f;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("introdu o valoare");
            try {
                x = scanner.nextFloat();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public double readDouble() {
        double x = 0.0d;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("introdu o valoare");
            try {
                x = scanner.nextDouble();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("tipul valorii introduse nu este corect");
            }
        }
        return x;

    }

    public int[] arrayFromTast(int position) {
        int[] array = new int[position];
        for (int i = 0; i < position; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("introdu elementul");
            try {
                array[i] = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("tipul elementului nu este corect");
            }
        }
        return array;
    }

    public List<Integer> listFromTast(List<Integer>mylist) {
        for (int i=0; i<mylist.size();i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("introdu elementul");
            try {
                mylist.add(scanner.nextInt());

            } catch (InputMismatchException e) {
              System.out.println("tipul elementului nu este corect");
            }
        }return mylist;
    }
}






