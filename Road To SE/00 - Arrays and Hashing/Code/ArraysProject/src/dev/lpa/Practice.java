package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        // We create a randomly generated array using the method getRandomArray That we can create (See method below)
        int[] generatedArray = getRandomArray(5);
        // Print created array
        System.out.println("Initial Array: " + Arrays.toString(generatedArray));

        // create a placeholder for later use
        int placeholder;
        // create a boolean flag to know when we can exit the loop
        boolean flag = true;

        while(flag){
            //as soon as we enter the loop we set the flag to false in case no more iterations are needed
            //Once the for loop is done we should have an ordered array, the next time it enter the for loop the flag
            //is never set to true, so it will exit the loop
            flag = false;

            // For loop where the code [generatedArray.length-1] is used, so we are able to check the last value without
            // throwing an error
            for(int i=0;i < generatedArray.length-1; i++ ){
                if(generatedArray[i]<generatedArray[i+1]){
                    // if the statement is true the placeholder value will store the smaller value to not lose it
                    placeholder = generatedArray[i];
                    // Then we assign the bigger value to come first in the array
                    generatedArray[i] = generatedArray[i+1];
                    // Now we use the placeholder value to assign it after the bigger value in the array
                    generatedArray[i+1] = placeholder;
                    flag = true;
                }
            }
        }

        System.out.println("Sorted Array is: " + Arrays.toString(generatedArray));

    }

    public static int[] getRandomArray(int arrLength){
        Random random = new Random();
        int[] newArr = new int[arrLength];

        for(int i = 0; i < arrLength; i++){
            newArr[i] = random.nextInt(100);
        }

        return newArr;
    }
}
