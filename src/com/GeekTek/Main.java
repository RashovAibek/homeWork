package com.GeekTek;

public class Main {

    public static void main(String[] args) {
        double [] array = {1.2, 1.3, -6.1, 2.1, 3.1, 8.6, -4.7, 7.6, 9.1, 9.11, -4.66, 7.1, 6.2, -9.78, 3.7};
        System.out.println("Первое положительное число = " +SearchNegativNum(array));
        double sum = 0;
        double counter = 0;

        for (int i = 2; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                counter++;
            }
        }
        System.out.println("количество положительных чисел после первого отрицательного = " + counter);
        System.out.println("среднее значения положительных чисел после первого отрицательного = " + sum / counter);

    }
    public static double SearchNegativNum(double [] array){
        double neme = array.length;
        for (int i = 0; i < neme; i++){
            if (array[i] < 0 )
                return array[i];

        }
        return -1;

    }
}
