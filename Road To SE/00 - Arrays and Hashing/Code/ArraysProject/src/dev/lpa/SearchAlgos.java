package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class SearchAlgos {
    public static void main(String[] args) {
        // BINARY SEARCH METHOD
        String[] sArray = {"Abel","Jane", "Mark", "Ralph", "David"};
        // We sort the array because binary search only works on sorted arrays
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        System.out.println();
        if(Arrays.binarySearch(sArray,"Mark")>= 0){
            System.out.println("Found Mark in the list");
        }

        // COMPARING ARRAYS
        System.out.println();
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }

        // THIS METHOD TAKES ORDER AND LENGTH INTO ACCOUNT
        int[] s3 = {5,4,3,2,1};
        if(Arrays.equals(s2,s3)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }

}
