package dev.lpa;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);

        // Insertion
        System.out.println("============================INSERTION 1D ARRAY==========================================");
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(1,30);
        sda.insert(12,120);

        // Accessing Array
        System.out.println("============================ACCESSING 1D ARRAY==========================================");
        int firstElement = sda.arr[0];
        System.out.println("First element is: " + firstElement);

        int thirdElement = sda.arr[2];
        System.out.println("Third element is: " + thirdElement);

        System.out.println("============================TRAVERSING 1D ARRAY==========================================");
        // Array Traversal
        sda.traverseArray();

        System.out.println("\n============================FINDING ELEMENT 1D ARRAY==========================================");

        //Finding Element
        sda.searchInArray(10);
        sda.searchInArray(4);

        System.out.println("============================DELETING ELEMENT 1D ARRAY==========================================");

        //Deleting Element
        sda.deleteInArray(1);
        sda.deleteInArray(12);

        //=====================================TWO DIMENSIONAL ARRAYS================================================

        System.out.println("\n============================INSERTION 2D ARRAY==========================================");

        TwoDimensionalArray tda = new TwoDimensionalArray(3,3);
        tda.insertValue(0,0,10);
        tda.insertValue(0,1,20);
        tda.insertValue(0,2,30);
        tda.insertValue(0,3,30);
        tda.insertValue(0,0,30);
        System.out.println(Arrays.deepToString(tda.arr));

        // Accessing Array
        System.out.println("============================ACCESSING 2D ARRAY==========================================");
        tda.accessCell(1,1);
        tda.accessCell(0,1);


        System.out.println("============================TRAVERSING 2D ARRAY==========================================");
        // Array Traversal
        tda.traverse2DArray();

        System.out.println("============================SEARCHING 2D ARRAY==========================================");
        tda.searchingValue(10);
        tda.searchingValue(30);
        tda.searchingValue(50);

        System.out.println("============================DELETING 2D ARRAY==========================================");
        tda.deleteValue(0,0);
        tda.deleteValue(0,2);
        tda.deleteValue(4,2);
    }
}
