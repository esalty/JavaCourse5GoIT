package module6;

import java.util.Arrays;

/**
 * Created by GodMod on 12/12/2016.
 */
public class Main {

    public static void main(String[] args) {
        int[] arrayOfInt = {-1, -2, -5, -3, -4, 0, -6, -7, -10, -11};
        double[] arrayOfDoubles = {-4.2567, -1.234342, -5555555555.777777777, -4353453453453453.354345345, -0.0000000000000000004545, -5.0e-10, -6.078e+15, -7.0, -8.0, -6};
        System.out.println("All elements summary  of integers array" + " " + ArraysUtils.sum(arrayOfInt));
        System.out.println("Minimal element of integers array " + " " + ArraysUtils.min(arrayOfInt));
        System.out.println("Maximum element of integers array " + " " + ArraysUtils.max(arrayOfInt));
        ArraysUtils.maxPositive(arrayOfInt);
        System.out.println("All elements multiplication of integers array" + " " + ArraysUtils.multiplication(arrayOfInt));
        ArraysUtils.modulus(arrayOfInt);
        System.out.println("Second Largest element of array" + " " + ArraysUtils.secondLargest(arrayOfInt));
        System.out.println("All elements summary  of doubles array" + " " + ArraysUtils.sum(arrayOfDoubles));
        System.out.println("Minimal element of doubles array " + " " + ArraysUtils.min(arrayOfDoubles));
        System.out.println("Maximum element of doubles array " + " " + ArraysUtils.max(arrayOfDoubles));
        ArraysUtils.maxPositive(arrayOfDoubles);
        System.out.println("All elements multiplication of doubles array" + " " + ArraysUtils.multiplication(arrayOfDoubles));
        ArraysUtils.modulus(arrayOfDoubles);
        System.out.println("Second Largest element" + " " + ArraysUtils.secondLargest(arrayOfDoubles));
        System.out.println(Arrays.toString(arrayOfInt));
        System.out.println("Reverse array of int" + " " + Arrays.toString(ArraysUtils.reverse(arrayOfInt)));
        System.out.println("Even elements of int array " + " " + Arrays.toString(ArraysUtils.findEvenElements(arrayOfInt)));
    }

}

