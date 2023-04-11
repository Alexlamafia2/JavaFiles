package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Create a program using arrays, that sorts a list of integers, in descending order.
        // Descending order means from the highest value to lowest. In other words, if the array
        // has the values 50, 25, 80, 5, and 15, your program should return an array, with the
        // values in the descending order: 80, 50, 25, 15,  and 5.
        // First, create an array of randomly generated integers. Print the array before you sort it and print the array after you sort it.
        // You can choose to create a new sorted array, or just sort the current array.
        int[] sortedArray = getRandomArray(5);
       // int[] firstArray = {50,25,80,5,15};
        System.out.println("Random Array is: " + Arrays.toString(sortedArray));

        // int[] sortedArray = Arrays.copyOf(firstArray, firstArray.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp  = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;

                    System.out.println("Sorted array is: " + Arrays.toString(sortedArray));
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(sortedArray));


    }

    public static int[] getRandomArray(int arrLength){
        Random random = new Random();
        int[] newInt = new int[arrLength];

        for(int i = 0; i < arrLength; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

}
