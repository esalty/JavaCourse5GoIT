package module2;

import java.util.Arrays;

/**
 * Created by GodMod on 11/7/2016.
 */
public class SimpleCalcIntDouble {
    public static void main(String[] args) {
    int [] arrayOfInt =  {9,2,-5,3,4,5,6,7,10,8};
    double [] arrayOfDoubles = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        System.out.println("All elements summary  of integer array" +" "+ sum(arrayOfInt) );
        System.out.println("Minimal element of integer array " +" "+ min(arrayOfInt) );
        System.out.println("Maximum element of integer array " +" "+ max(arrayOfInt) );
        System.out.println("Maximum positive element of integer array " +" "+ maxPositive(arrayOfInt) );
        System.out.println("All elements multiplication of integer array"+" "+ multiplication(arrayOfInt));
        System.out.println("Modulus of first and last elements of integer array"+" "+ modulus(arrayOfInt));
        System.out.println("Second Largest element"+" "+ secondLargest(arrayOfInt));
    }

    static int sum(int array[]) {
        int summary = 0;
         for (int i=0; i < array.length; i++) {
             summary += array[i];
         }
        return summary;

    }

    static  int min(int array[]){
        int minimalElement =array[0];;
        for (int i=0; i<array.length;i++) {

            if (minimalElement>array[i])
            {
                minimalElement=array[i];
            }
        }
        return minimalElement;
    }
    static int max(int array[]){

        int maximumElement =array[0];;
        for (int i=0; i<array.length;i++) {

            if (maximumElement<array[i])
            {
                maximumElement=array[i];
            }
        }
        return maximumElement;


        }
    static int maxPositive(int array[]){
        int maximumPositive=0;
        for (int i=0; i<array.length;i++) {

            if ((array[i]>0) && (maximumPositive<array[i])) {
                maximumPositive=array[i];
            }
        }
        return maximumPositive;
            }

    static int multiplication(int array[]){
        int multiplication=1;
        for (int number:array) {
            multiplication*=number;
        }
        return multiplication;
            }
    static int modulus(int array[]){

        int modulusFirstLast=0;
        int first=array[0];
        int last =array[array.length-1];
        if (last!=0) {
            modulusFirstLast=first/last;
            return modulusFirstLast;
        }
        return 0;
            }
    static int secondLargest(int array[]) {
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
                    }
                    return array[array.length-2];
    }
    static double sum(double array[]){
        return 1;
    }
    static double min(double array[]){
        return 1;
    }
    static double max(double arrayOfDoubles[]){
        return 1;
    }
    static double maxPositive(double arrayOfDoubles[]){
        return 1;
    }
    static double multiplication(double arrayOfDoubles[]){
        return 1;
    }
    static double modulus(double arrayOfDoubles[]){
        return 1;
    }
    static double secondLargest(double arrayOfDoubles[]){
        return 1;
    }
}




