package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Min number in array is: " + returnedMin);
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of Strings Separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for(int i = 0; i < splits.length; i++){
            // In the following line of code we convert the string to an integer using
            // Integer.parseInt, and then we get the value stored in array splits[i] and trim
            // it to make sure we don't get any spaces
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] arr){

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
