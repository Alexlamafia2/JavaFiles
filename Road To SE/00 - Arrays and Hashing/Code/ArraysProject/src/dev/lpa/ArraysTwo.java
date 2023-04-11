package dev.lpa;

import java.util.Arrays;

public class ArraysTwo {
    public static void main(String[] args) {
        // Creating a non initialized array
        int[] newArray = new int[5];
        // We can loop through an array to assign values to it
        for (int i = 0; i < newArray.length; i++){
            // here we are assigning a value of [length of the array - 1] to index i of the array
            newArray[i] = newArray.length - i;
            // i=0 --> ArrayLength = 5 --> 5 - 0 = 5
            // i=1 --> ArrayLength = 5 --> 5 - 1 = 4
            // i=2 --> ArrayLength = 5 --> 5 - 2 = 3
            // i=3 --> ArrayLength = 5 --> 5 - 3 = 2
            // i=4 --> ArrayLength = 5 --> 5 - 4 = 1
            // RESULT --> [5 4 3 2 1]
        }

        // You can loop through the elements of an array retrieving each value with the loop index
        for(int i = 0; i < newArray.length ; i++){
            System.out.println(newArray[i] + " ");
        }

        System.out.println();
        // USING ENHANCED for Loop
        for (int element : newArray){
            System.out.println(element + " ");
        }
        System.out.println();
        System.out.println(newArray); // prints a hexadecimal representation of the hash code
        System.out.println(Arrays.toString(newArray)); // prints the array enclosed by brackets and every element
                                                       // is separated by a comma.

        // You can assign any array, to an Object variable
        Object objectVariable = newArray;
        if(objectVariable instanceof  int[]){
            System.out.println("objectVariable is really an int array");
        }

        // The instanceof keyword checks whether an object is an instance of a specific class or an interface.
        // The instanceof keyword compares the instance with type. The return value is either true or false .

        // You can create an array of objects that supports any kind of type in Java
        // It is not good practice but you can do it
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = Arrays.toString(newArray);

        System.out.println(Arrays.toString(objectArray));
    }
}
