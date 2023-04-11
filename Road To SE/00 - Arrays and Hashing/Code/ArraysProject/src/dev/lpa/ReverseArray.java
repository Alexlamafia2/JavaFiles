package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] Array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i = 0; i < 5; i++){
            String input = scanner.nextLine();
            Array[i] = Integer.parseInt(input.trim());
        }
        System.out.println("Entered Array: " + Arrays.toString(Array));
        Arrays.sort(Array);
        System.out.println("Sorted Array: " + Arrays.toString(Array));

        reverse(Array);

        int[] newArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        reverse(newArray);
    }

    private static void reverse(int[] arr){
        int counter = 1;
        int temp;
        int iterations = arr.length;
        if(iterations % 2 != 0){
            iterations = iterations / 2;
        }else{
            iterations = (iterations/2) + 1;
        }
        System.out.println("Number of iterations: " + iterations);
        for(int i = 0; i < iterations;i++){
            temp = arr[i];
            arr[i] = arr[arr.length  - counter];
            arr[arr.length - counter] =  temp;
            counter ++;

        }
        System.out.println("Reversed array is: "  + Arrays.toString(arr));
    }
}
