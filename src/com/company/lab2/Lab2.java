package com.company.lab2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab2 {

    public static void main(String[] args) {


        LogicalOp logic= new LogicalOp();
        int [] myArray= logic.setValuesToArray(100);
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
        logic.arrayWithoutValue(sir,1);




    }
}








