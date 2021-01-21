package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here
        int ropmain1=opmain1(-5,8,6);
        System.out.println(ropmain1);
        int ropmain2=opmain2(55,9,9);
        System.out.println(ropmain2);
        float ropmain3=opmain3(20,-3,5,8);
        System.out.println(ropmain3);
        float ropmain4=opmain4(5,15,3,2,8,3);
        System.out.println(ropmain4);

        System.out.println("Hello Ivona");

        byte no1 = 1 + 2;
        System.out.println(no1);

        float no2 = 3;
        float no3 = 2;
        System.out.println(no2 / no3);
        //float no2=(float)3/2;
        //System.out.println(no2);

        byte op1 = -5 + 8 * 6;
        System.out.println(op1);

        int op2 = 55+9%9;
        System.out.println(op2);

        float op3 = 20;
        float op4 = (float) (-3) * 5 / 8;
        System.out.println(op3 + op4);
        //float op3= 20+(float)(-3)*5/8;
        //System.out.println(op3);

        float op5 = 5 + 15 / 3f* 2 - 8 % 3;
        System.out.println(op5);
    }

        static int opmain1(int no1,int no2,int no3){
            int result;
            result=no1+no2*no3;
            return(result);
        }

        static int opmain2(int no1,int no2,int no3){
           int result;
           result=no1+no2%no3;
           return(result);
        }

        static float opmain3(float no1, float no2, float no3, float no4){
            float result;
            result=no1 + no2*no3 / no4;
            return(result);
        }
       static float opmain4(float no1,float no2,float no3,float no4,float no5,float no6){
            float result;
            result=no1 + no2 / no3 * no4 - no5 % no6;
            return(result);
       }


