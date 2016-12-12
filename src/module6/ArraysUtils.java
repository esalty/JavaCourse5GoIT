package module6;

import java.util.Arrays;

/**
 * Created by GodMod on 12/12/2016.
 */
public final class ArraysUtils {
    final static int[] reverse(int[] array) {
        int reverseArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }

    final static int[] findEvenElements(int[] array) {

        int evenArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ++evenArrayLength;
            }
        }
        int evenArray[] = new int[evenArrayLength];
int j=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[j] = array[i];
                j++;
            }

        }
        return evenArray;
    }

    final static int sum(int array[]) {
        int summary = 0;
        for (int i = 0; i < array.length; i++) {
            summary += array[i];
        }
        return summary;

    }

    final static int min(int array[]) {
        int minimalElement = array[0];
        for (int i = 0; i < array.length; i++) {

            if (minimalElement > array[i]) {
                minimalElement = array[i];
            }
        }
        return minimalElement;
    }

    final static int max(int array[]) {

        int maximumElement = array[0];
        for (int i = 0; i < array.length; i++) {

            if (maximumElement < array[i]) {
                maximumElement = array[i];
            }
        }
        return maximumElement;
    }

    final static void maxPositive(int array[]) {
        int maximumPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 0) && (maximumPositive < array[i])) {
                maximumPositive = array[i];
            }
        }
        if (maximumPositive == 0) {
            System.out.println("We haven't any positive number in array");
        } else System.out.println("Maximum positive element of integers array" + " " + maximumPositive);

    }

    final static int multiplication(int array[]) {
        int multiplication = 1;
        for (int number : array) {
            multiplication *= number;
        }
        return multiplication;
    }

    final static void modulus(int array[]) {
        int modulusFirstLast = 0;
        int first = array[0];
        int last = array[array.length - 1];
        if (last != 0) {
            modulusFirstLast = first / last;
            System.out.println("Modulus of first and last elements of integers array" + " " + modulusFirstLast);
        } else {
            System.out.println("Division by zero");
        }
    }

    final static int secondLargest(int array[]) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    final static double sum(double array[]) {
        double summary = 0;
        for (int i = 0; i < array.length; i++) {
            summary += array[i];
        }
        return summary;
    }


    final static double min(double array[]) {
        double minimalElement = array[0];
        for (int i = 0; i < array.length; i++) {

            if (minimalElement > array[i]) {
                minimalElement = array[i];
            }
        }
        return minimalElement;
    }

    final static double max(double array[]) {
        double maximumElement = array[0];
        ;
        for (int i = 0; i < array.length; i++) {

            if (maximumElement < array[i]) {
                maximumElement = array[i];
            }
        }
        return maximumElement;
    }

    final static void maxPositive(double array[]) {
        double maximumPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 0) && (maximumPositive < array[i])) {
                maximumPositive = array[i];
            }
        }
        if (maximumPositive == 0) {
            System.out.println("We haven't any positive number in array");
        } else System.out.println("Maximum positive element of doubles array" + " " + maximumPositive);

    }

    final static double multiplication(double array[]) {
        double multiplication = 1;
        for (double number : array) {
            multiplication *= number;
        }
        return multiplication;
    }

    final static void modulus(double array[]) {
        double modulusFirstLast = 0;
        double first = array[0];
        double last = array[array.length - 1];
        if (last != 0) {
            modulusFirstLast = first / last;
            System.out.println("Modulus of first and last elements of integers array" + " " + modulusFirstLast);
        } else System.out.println("Division by zero");
    }

    final static double secondLargest(double array[]) {
        Arrays.sort(array);
        return array[array.length - 2];
    }
}
