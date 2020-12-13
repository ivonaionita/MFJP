package com.company.lab2;

public class Lab2 {

    public static void main(String[] args) {



    }
    static int opmain1(int no1,int no2,int no3){
        int result;
        result=no1+no2*no3;
        return(result);
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

    public void prinprintjava(String[]arg){

        System.out.println("               J     a      v     v       a ");
        System.out.println("               J    a  a     v   v      a   a");
        System.out.println("            J  J   a aa a     V V      a aa  a");
        System.out.println("             JJ   a      a     V      a       a");
    }

    static float arithmetic (float no1, float no2, float no3){
        return (no1+no2+no3)/3;
}

    public void printface(String[]arg){
        System.out.println(" +\"\"\"\"\"\"+"  + '\n'+"[|  O O |] " +'\n'+ " |   ^  | "  +'\n'+ " |  '_' | "  +'\n'+ "  +______+");
    }

    static int rest (int no1, int no2){
        return(no1%no2);
}
    static float temperature(float farenheit) {
        float celsius;
        celsius=5/9f*(farenheit-32);
        return (celsius);
}
    static float convertor(float inch){
        float meters;
        meters= inch /39.3701f;
        return(meters);
}
    static float[] masina (float d, float h ,float m, float s){
        float minutetosecond= 60f*m;
        float hourtosecond= 3600f*h;
        float speed=d/(minutetosecond+hourtosecond+s);
        float speed2=speed*18/5;
        float speed3=speed2*0.621371f ;

        return new float[]{speed, speed2, speed3};

        }

        static int abcd (int y){
         y= --y;
         int x;
         x=y;
        return(x);
        }
}



