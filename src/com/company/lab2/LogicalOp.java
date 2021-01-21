package com.company.lab2;

import java.util.List;

public class LogicalOp<copy> {

    public void prinprintjava(String[] arg) {

        System.out.println("               J     a      v     v       a ");
        System.out.println("               J    a  a     v   v      a   a");
        System.out.println("            J  J   a aa a     V V      a aa  a");
        System.out.println("             JJ   a      a     V      a       a");
    }


    public void printface(String[] arg) {
        System.out.println(" +\"\"\"\"\"\"+" + '\n' + "[|  O O |] " + '\n' + " |   ^  | " + '\n' + " |  '_' | " + '\n' + "  +______+");
    }


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
        if (x > 3 && !((x == 4))) {
            String textshsh = "The number is greater than 3 and not equal to 4";
            return textshsh;
        } else if (x == 4) {
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
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
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
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else return z;

    }

    public void printNumberTo100(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void printDecrease(int bigNumber, int smallNumber) {
        for (int i = bigNumber; i >= smallNumber; i--) {
            System.out.println(i);
        }
    }

    public void printNumberToMinus100(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void countFromBiggerNumber(int x, int y) {
        for (int i = x; i < y; i++) {
            System.out.println(i);
        }
    }

    public void countFromBiggerNumber2(int x, int y) {
        for (int i = x; i < y; i++) {
            System.out.println(i);
        }
        for (int i = y; i < x; i++) {
            System.out.println(i);
        }

    }

    public void getEven() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }

    public void getOdd() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }

    public void sumFromNo(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void averageFromNo(float number) {
        float sum = 0;
        float average = 0;
        for (float i = number; i <= 100; i++) {
            sum = sum + i;
        }
        average = sum / (100 - number + 1);
        System.out.println(average);
    }

    static void printPattern(int n) {
        int line = 0;
        int star = 0;
        for (line = 1; line <= n; line++) {
            for (star = 8; star > line; star--) {
                System.out.print("*");
            }
            if (star == line) {
                System.out.println("");
                star = 0;
            }
        }
    }

    public void countFromNo(int i) {
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }

    public void countUntillMinus100(int i) {
        do {
            System.out.println(i);
            i--;
        } while (i >= -100);
    }

    public void countBetween2Numbers(int x, int y) {
        do {
            System.out.println(x);
            x++;
        } while (x <= y);
    }

    public void countFromBigger(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
        while (y <= x) {
            System.out.println(y);
            y++;
        }
    }

    public void printEvenOneToHundred() {
        int x = 1;
        do {
            if (x % 2 == 0)
                System.out.println(x);
            x++;

        } while (x <= 100);

    }

    public void printOddOneToHundred() {
        int x = 1;
        do {
            if (x % 2 == 1)
                System.out.println(x);
            x++;

        } while (x <= 100);

    }

    public void intervalArithmetics() {
        int x = 111;
        int sum = 0;
        int count = 0;
        while (x <= 8899) {
            sum = sum + x;
            x++;
            count++;
        }
        System.out.println(sum);
        System.out.println(sum / count);
    }

    public void intervalDivideSeven(float x, float y) {
        float sum = 0;
        int count = 0;
        float average = 0;
        while (x <= y) {
            if ((x % 7) == 0) {
                sum = sum + x;
                count++;
            }
            x++;
            average = sum / count;
        }
        System.out.println(average);

    }

    public void fibonacci() {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int n3;
        int count = 20;
        int n4 = 2;
        while (n4 < count) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            n4++;
        }

    }

    public void CozaLozaWoza() {
        int i = 1;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void populateArrayWithValues(int[] array, int maxvalue) {
        for (int i = 0; i < maxvalue; i++) {
            array[i] = i + 1;
        }
    }

    public int[] setValuesToArray(int maxValue) {
        int[] array = new int[100];
        for (int i = 0; i < maxValue; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public int[] setConsecutiveValuesToArray(int minim, int maxValue) {
        int[] array = new int[maxValue];
        for (int i = minim - 1; i < maxValue; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public int[] getEvenNumbersArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        return array;
    }


    public double getAverageFromArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; // sum +=myArray[i];

        }
        return sum / array.length;
    }

    public boolean isValueInArray(int[] array, int ceva) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ceva)
                return true;
        }
        return false;
    }

    public int isValueInArray2(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;

    }

    public String[] setArrayMinus(int max) {
        String[] myArray = new String[max];
        for (int i = 0; i < max; i++) {
            myArray[i] = "-";
        }
        return myArray;
    }

    public void printMinus(String[] myArray) {
        for (int i = 0; i <= 9; i++) {
            System.out.print("-");
        }
    }

    public void printMinus2(String[] myArray, int number) {

        for (int i = 0; i <= 9; i++) {
            printMinus(myArray);
            System.out.println();

        }
    }

    public void arrayWithoutValue(int[] args, int value) {
        int[] array = {1, 2, 3, 4};
        int[] secondArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                secondArray[j++] = array[i];
            }
        }
        printArray(secondArray);
    }

    public int secondSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > smallest && array[i] < secondSmallest) {
                secondSmallest = array[i];
            }
        }
        return secondSmallest;

    }

    public void copyArray(int[] args) {
        int[] array = {1, 2, 3, 4};
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        printArray(copy);
    }


    public List<Integer> addNumber(List<Integer> mylist, int number) {
        mylist.add(number);
        return mylist;
    }

    public void printList(List<Integer> mylist) {
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }

    public void fromNumber(List<Integer> myList, int x) {
        for (int i = x; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }
    }

    public void reverseNumbers(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }

    }

    public List<String> addNameToList(List<String> myList, int number, String text) {
        myList.add(number, text);
        return myList;
    }

    public List<Integer> addOnFirstPosition(List<Integer> mylist, int x) {
        mylist.add(0, x);
        return mylist;
    }

    public void printList2(List<Integer> mylist) {
        int position = 0;
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println("Pe pozitia " + position + " valoarea este " + mylist.get(i));
            position++;
        }
    }

    public int biggestNumberFromList(List<Integer> mylist) {
        int maxim = mylist.get(0);
        for (int i = 0; i < mylist.size(); i++) {
            if (mylist.get(i) > maxim) {
                maxim = mylist.get(i);

            }
        }
        return maxim;
    }

    public void printValueFromArrayTC(int[] array, int i) {
        array = new int[]{1000, 22, 34, 4};
        try {
            System.out.println(array[i]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");
        }
    }

    public void wait(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            System.out.println("ERROR");
        }

    }


}










