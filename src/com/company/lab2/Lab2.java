package com.company.lab2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab2 {

    public static void main(String[] args) {


        LogicalOp logic= new LogicalOp();
    /*    int [] myArray= logic.setValuesToArray(100);
        logic.printArray(myArray);

        String [] myArray2= logic.setArrayMinus(7);
        logic.printMinus2(myArray2,6);
        int [] sir={2,56,54,786};
       /* logic.isValueInArray(sir,5);
        System.out.println(logic.isValueInArray(sir,5));
        logic.isValueInArray2(sir,5);
        System.out.println(logic.isValueInArray2(sir,5));
        logic.getEvenNumbersArray(myArray);
        logic.secondSmallest(sir);
        System.out.println(logic.secondSmallest(sir)); */
      //  logic.arrayWithoutValue(sir,1);

        List<Integer> mylist= new ArrayList();
        mylist.add(1);
        mylist.add(7);
        mylist.add(100);
        mylist.add(0);
       // logic.printList(mylist);
       // System.out.println(logic.addNumber(mylist,4));
       // logic.fromNumber(mylist,1);
       // logic.reverseNumbers(mylist);

       // List<String> mySecondList= new ArrayList();
       // mySecondList.add("Ana");
       // mySecondList.add("Maria");
       // mySecondList.add("Ioana");

       // System.out.println(logic.addNameToList(mySecondList,1,"Dana"));
       //  System.out.println(logic.addOnFirstPosition(mylist,24));
       // logic.printList2(mylist);
        System.out.println(logic.biggestNumberFromList(mylist));

    }
}








