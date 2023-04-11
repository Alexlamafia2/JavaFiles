package dev.lpa;

import java.util.Arrays;

public class ReverseArraySolutionTwo {
    public static void main(String[] args) {
        int[] newArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
         reverse(newArray);
        System.out.println("Reversed Array: " + Arrays.toString(newArray));

        int[] anotherArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        reverseCopy(anotherArray);
        System.out.println("Reversed Array: " + Arrays.toString(newArray));
    }

    // This is a mutating method because it uses the given array
    // This method is shorter but way less efficient since you are creating a whole new array,
    // and depending on hw big the array is it might take a lot out of memory.
    private static void reverse(int[] arr){
        int maxIndex = arr.length - 1;
        int halfLength = arr.length / 2;

        for(int i = 0; i<halfLength; i++){
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }
    }
    // This is not a mutating method because it uses a copy of the given array
    private static int[] reverseCopy(int[] arr){
        int[] reversedArray = new int[arr.length];
        int maxIndex = arr.length - 1;
        for(int el : arr){
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }


}
