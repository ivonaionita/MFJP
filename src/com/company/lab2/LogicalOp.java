package com.company.lab2;

public class LogicalOp {

    public int checkBiggerNumber(int x, int y) {
        if (x > y) {
            return (x);
        } else {
            return (y);
        }
    }

    public String compareString(String value) {
        if (value.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }

    }

    public String verifyTextAndNumber(int x, String text) {
        if (text.equals("FastTrackIT") && x <= 3) {
            return text + x;
        } else if (!text.equals("FastTrackIT") && x >= 4) {
            return x + text;
        } else return "";
    }

    public String snowForcast(int x) {
        if ((x > 8) || (x == 6)) {
            String text = "The amount of snow this winter was(cm):";
            return text + x;
        } else {
            String text = "The forcast snow is (cm)";
            return text + x;
        }
    }

    public String verificare(int x) {
        if (x > 3 && !((x==4))) {
            String textshsh = "The number is greater than 3 and not equal to 4";
            return textshsh;
        } else if (x==4){
            return "The number is equal to 4";
        } else if (x < 3) {
            String text2 = "The number is lower than 3";
            return text2;
        } else {
            return "";
        }
    }

    public String switchCase1(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is 1");
            case 2:
                System.out.println("The number is 2");
            case 3:
                System.out.println("The number is 3");
            default:
                System.out.println("not 1, 2 or 3");
        }
        return "";
    }

    public boolean isNumberEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEligibleToVote(int x) {
        if (x >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int compareBiggerNumber(int x, int y, int z) {
        if (x > y && x>z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else return z;

    }
}
