package com.company.lab2;

public class Calculator {
    public int opMain1(int no1,int no2,int no3){
        int result;
        result=no1+no2*no3;
        return(result);
    }

    public int sum(int no1, int no2){
        return (no1 + no2);
    }

    public int dec(int no1, int no2){
        return (no1-no2);
    }
    public int mult(int no1, int no2){
        return (no1*no2);
    }
    public float divide(float no1,float no2){
        return(no1/no2);
    }
    public float multiple (float no1, float no2, float no3){
        return(no1/no2/no3);
    }

    public float arithmetic (float no1, float no2, float no3){
        return (no1+no2+no3)/3;
    }

    public int rest (int no1, int no2){
        return(no1%no2);
    }

    public float temperature(float farenheit) {
        float celsius;
        celsius=5/9f*(farenheit-32);
        return (celsius);
    }
    public float convertor(float inch){
        float meters;
        meters= inch /39.3701f;
        return(meters);
    }
    public float[] masina (float d, float h ,float m, float s){
        float minutetosecond= 60f*m;
        float hourtosecond= 3600f*h;
        float speed=d/(minutetosecond+hourtosecond+s);
        float speed2=speed*18/5;
        float speed3=speed2*0.621371f ;

        return new float[]{speed, speed2, speed3};

    }
}
