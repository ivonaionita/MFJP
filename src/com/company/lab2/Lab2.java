package com.company.lab2;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class Lab2 {

    public static void main(String[] args) {

        Calculator calcOp1 = new Calculator();
        System.out.println(calcOp1.opMain1(1, 2, 4));

        Calculator calcOp2 = new Calculator();
        System.out.println(calcOp2.sum(2, 3));

        Calculator calcOp3 = new Calculator();
        System.out.println(calcOp3.dec(4, 5));

        Calculator calcOp4 = new Calculator();
        System.out.println(calcOp4.divide(4, 5));

        Calculator calcOp5 = new Calculator();
        System.out.println(calcOp5.mult(2, 3));

        Calculator calcOp6 = new Calculator();
        System.out.println(calcOp6.multiple(2, 4, 5));

        Calculator calcOp7 = new Calculator();
        System.out.println(calcOp7.arithmetic(3, 5, 7));

        Calculator calcOp8 = new Calculator();
        System.out.println(calcOp8.rest(3, 2));

        Calculator calcOp9 = new Calculator();
        System.out.println(calcOp9.temperature(34));

        Calculator calcOp10 = new Calculator();
        System.out.println(calcOp10.convertor(23));

        LogicalOp compareNumbers1 = new LogicalOp();
        // System.out.println(compareNumbers1.checkBiggerNumber(5,4));
        int biggest = compareNumbers1.checkBiggerNumber(3, 4);
        System.out.println("the bigger number is" + biggest);

        LogicalOp compareStrings1 = new LogicalOp();
        System.out.println(compareStrings1.compareString("kjaskajsa"));

        LogicalOp veriftTextAndNumber1 = new LogicalOp();
        System.out.println(veriftTextAndNumber1.verifyTextAndNumber(2, "FastTracukIT"));

        LogicalOp verifSnowForcast = new LogicalOp();
        System.out.println(verifSnowForcast.snowForcast(8));

        LogicalOp rVerifyNumber = new LogicalOp();
        System.out.println(rVerifyNumber.verificare(4));

        LogicalOp rSwitchCase = new LogicalOp();
        ;
        System.out.println(rSwitchCase.switchCase1(6));

        LogicalOp rIsNumberEven = new LogicalOp();
        System.out.println(rIsNumberEven.isNumberEven(5));

        LogicalOp rIsEligibleToVote = new LogicalOp();
        System.out.println(rIsEligibleToVote.isEligibleToVote(19));

        LogicalOp rCompareBiggerNumber = new LogicalOp();
        System.out.println(rCompareBiggerNumber.compareBiggerNumber(9, 6, 7));


    }


    public void prinprintjava(String[] arg) {

        System.out.println("               J     a      v     v       a ");
        System.out.println("               J    a  a     v   v      a   a");
        System.out.println("            J  J   a aa a     V V      a aa  a");
        System.out.println("             JJ   a      a     V      a       a");
    }


    public void printface(String[] arg) {
        System.out.println(" +\"\"\"\"\"\"+" + '\n' + "[|  O O |] " + '\n' + " |   ^  | " + '\n' + " |  '_' | " + '\n' + "  +______+");
    }
}








