package dev.lpa;

public class ArraysOne {
    public static void main(String[] args) {
        // Initializing an Array
        int[] myIntArray = new int[10];

        //Initializing and Array easily using an anonymous array
        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("First element = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of the array is: " + arrayLength);
        // We can easily access the last element of an array
        System.out.println("Last element is: " + firstTen[arrayLength - 1]);

        // Accessing the Array
        myIntArray[5] = 50; // Assign 50 to index 5 element 6
        // You can't assign a different data type other than the one you assigned in the array declaration
        // myIntArray[0] = 45.0; If you do this you will get a compiler error
        // myIntArray[1] = "1"; If you do this you will get a compiler error

        // Arrays can be any primitive type
        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        //printing the element we assigned in line 13
        System.out.println(myDoubleArray[2]);


        // Creating a new array
        int[] newArray = {5,4,3,2,1};
        // You can loop through the elements of an array retrieving each value with the loop index
        for(int i = 0; i < newArray.length ; i++){
            System.out.println(newArray[i] + " ");
        }



    }
}
