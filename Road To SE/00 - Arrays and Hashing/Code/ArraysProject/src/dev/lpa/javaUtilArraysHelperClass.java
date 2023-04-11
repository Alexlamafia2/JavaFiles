package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class javaUtilArraysHelperClass {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        // Sorting an array using the Java.util.Arrays library
        Arrays.sort(firstArray); // This method doesn't return anything
        System.out.println(Arrays.toString(firstArray));

        // Let's say we want to set all the values in an array, to our own initial value, before processing
        // We want something besides zeros, but we don't want to use an array initializer
        // We use the fill method for this
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        // If you don't want changes made to your original array, you can make a copy and apply operations to it.
        // You can use the copyOf method
        int [] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        System.out.println();
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        System.out.println();
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));



    }

    private static int[] getRandomArray(int len){
        // Random is a class in the java.util library.
        // It has methods on it to return random numbers.
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
