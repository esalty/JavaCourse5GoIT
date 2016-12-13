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

        User[] users = {
                new User(1, "Roma", "Gercen", 1200, 1000),
                new User(1, "Oleg", "Krepish", 1200, 1000),
                new User(7657567, "Ivan", "Klym", 900, 100),
                new User(567567, "Petro", "Sivach", 1000, 700),
                new User(2, "Ura", "Ura", 200, 1300),
                new User(34234, "Tony", "Prot", 1000, 1000),
                new User(2, "Shura", "Mushik", 200, 1300),
                new User(2, "Roma", "Gercen", 200, 1300),
        };

        System.out.println("Users' IDs:\n" + Arrays.toString(UserUtils.getUsersId(users)));
        User[] uniqueUsers = UserUtils.uniqueUsers(users);
        System.out.println("Unique users:\n" + Arrays.toString(uniqueUsers));
        System.out.println("Users with balance of 1000:\n"
                + Arrays.toString(UserUtils.usersWithConditionalBalance(uniqueUsers, 1300)));
        System.out.println("Paying salaries...\n" + Arrays.toString(UserUtils.paySalaryToUsers(uniqueUsers)));



    }

}

