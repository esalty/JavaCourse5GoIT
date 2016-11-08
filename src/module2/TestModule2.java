package module2;

import static module2.SimpleCalcIntDouble.*;

/**
 * Created by GodMod on 11/2/2016.
 */
public class TestModule2 {
    public static void main(String[] args) {
        int[] arrayOfInt = {9, 2, -5, 3, 4, 5, 6, 7, 10, 11};
        double[] arrayOfDoubles = {4.2567, -1.234342, 5555555555.777777777, -4353453453453453.354345345, 0.0000000000000000004545, -5.0e-10, 6.078e+15, 7.0, 8.0, 6};
        System.out.println("All elements summary  of integers array" + " " + sum(arrayOfInt));
        System.out.println("Minimal element of integers array " + " " + min(arrayOfInt));
        System.out.println("Maximum element of integers array " + " " + max(arrayOfInt));
        System.out.println("Maximum positive element of integers array " + " " + maxPositive(arrayOfInt));
        System.out.println("All elements multiplication of integers array" + " " + multiplication(arrayOfInt));
        modulus(arrayOfInt);
        System.out.println("Second Largest element of array" + " " + secondLargest(arrayOfInt));
        System.out.println("All elements summary  of doubles array" + " " + sum(arrayOfDoubles));
        System.out.println("Minimal element of doubles array " + " " + min(arrayOfDoubles));
        System.out.println("Maximum element of doubles array " + " " + max(arrayOfDoubles));
        System.out.println("Maximum positive element of doubles array " + " " + maxPositive(arrayOfDoubles));
        System.out.println("All elements multiplication of doubles array" + " " + multiplication(arrayOfDoubles));
        modulus(arrayOfDoubles);
        System.out.println("Second Largest element" + " " + secondLargest(arrayOfDoubles));
    }




}
