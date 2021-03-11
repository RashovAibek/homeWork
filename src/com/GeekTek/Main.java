package com.GeekTek;

public class Main {

    public static void main(String[] args) {

        double[] array = {3.2, -5.2, 1.3, -4.2, -4.1, -2.5, -6.1, -6.3, 8.2, -5.3};

        double sum = 0;
        double number = 0;
        boolean isFirstNegativeNumber = false;

        for (double n: array) {
            if (n < 0) isFirstNegativeNumber = true;
            else if (n > 0 && isFirstNegativeNumber){
                sum = sum + n;
                number = number + 1;
            }
        }
        System.out.println(sum / number);
    }
}


