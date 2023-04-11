package dev.lpa;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        // Initialization and definition of 2D Array
        int [][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length: " + array2.length);

        for(int i = 0;  i < array2.length; i++){
            for(int j = 0;  j < array2[i].length; j++){
                array2[i][j] = (i * 10) + (j + 1);
            }
        }

        for(int[] outer : array2){
            System.out.println(Arrays.toString(outer));
        }

        System.out.println(Arrays.deepToString(array2));




    }
}
