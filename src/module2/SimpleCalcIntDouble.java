package module2;

import java.util.Arrays;

/**
 * Created by GodMod on 11/7/2016.
 */
public class SimpleCalcIntDouble {

    static int sum(int array[]) {
        int summary = 0;
        for (int i = 0; i < array.length; i++) {
            summary += array[i];
        }
        return summary;

    }

    static int min(int array[]) {
        int minimalElement = array[0];
        for (int i = 0; i < array.length; i++) {

            if (minimalElement > array[i]) {
                minimalElement = array[i];
            }
        }
        return minimalElement;
    }

    static int max(int array[]) {

        int maximumElement = array[0];
        for (int i = 0; i < array.length; i++) {

            if (maximumElement < array[i]) {
                maximumElement = array[i];
            }
        }
        return maximumElement;
    }

    static void maxPositive(int array[]) {
        int maximumPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 0) && (maximumPositive < array[i])) {
                maximumPositive = array[i];
            }
        }
       if (maximumPositive==0){
           System.out.println("We haven't any positive number in array");
       } else System.out.println("Maximum positive element of integers array"+" "+maximumPositive);

    }

    static int multiplication(int array[]) {
        int multiplication = 1;
        for (int number : array) {
            multiplication *= number;
        }
        return multiplication;
    }

    static void modulus(int array[]) {
        int modulusFirstLast = 0;
        int first = array[0];
        int last = array[array.length - 1];
        if (last != 0) {
            modulusFirstLast = first / last;
            System.out.println("Modulus of first and last elements of integers array" +" "+ modulusFirstLast);
        } else {
            System.out.println("Division by zero");
        }
    }

    static int secondLargest(int array[]) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    static double sum(double array[]) {
        double summary = 0;
        for (int i = 0; i < array.length; i++) {
            summary += array[i];
        }
        return summary;
    }


    static double min(double array[]) {
        double minimalElement = array[0];
        for (int i = 0; i < array.length; i++) {

            if (minimalElement > array[i]) {
                minimalElement = array[i];
            }
        }
        return minimalElement;
    }

    static double max(double array[]) {
        double maximumElement = array[0];
        ;
        for (int i = 0; i < array.length; i++) {

            if (maximumElement < array[i]) {
                maximumElement = array[i];
            }
        }
        return maximumElement;
    }

    static void maxPositive(double array[]) {
        double maximumPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 0) && (maximumPositive < array[i])) {
                maximumPositive = array[i];
            }
        }
        if (maximumPositive==0){
            System.out.println("We haven't any positive number in array");
        } else System.out.println("Maximum positive element of doubles array"+" "+maximumPositive);

    }

    static double multiplication(double array[]) {
        double multiplication = 1;
        for (double number : array) {
            multiplication *= number;
        }
        return multiplication;
    }

    static void modulus(double array[]) {
        double modulusFirstLast = 0;
        double first = array[0];
        double last = array[array.length - 1];
        if (last != 0) {
            modulusFirstLast = first / last;
            System.out.println("Modulus of first and last elements of integers array"+" "+modulusFirstLast);
        }
        else System.out.println("Division by zero");
            }

    static double secondLargest(double array[]) {
        Arrays.sort(array);
        return array[array.length - 2];
    }
}




