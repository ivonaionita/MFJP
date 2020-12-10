package com.company.lab2;

public class Lab2 {
    public static void main(String[] args) {
    int result = sum(2,3);
        System.out.println(result);
    int resultdec= dec(4,3);
        System.out.println(resultdec);
    int resultmult=mult(4,5);
        System.out.println(resultmult);
    float resultdivide=divide(3,5);
        System.out.println(resultdivide);
        float rmultiple = multiple(3,5,78);
        System.out.println(rmultiple);
    }


    static int sum(int no1, int no2){
        return (no1 + no2);
    }

    static int dec(int no1, int no2){
        return (no1-no2);
    }
    static int mult(int no1, int no2){
        return (no1*no2);
    }
    static float divide(float no1,float no2){
        return(no1/no2);
    }
    static float multiple (float no1, float no2, float no3){
        return(no1/no2/no3);
    }

}