package dev.lpa;

import java.util.Arrays;

// Time Complexity O(1)
public class SingleDimensionArray {
    int arr[] = null;
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for(int i=0; i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Array Insertion
    public void insert(int location, int value){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = value;
                System.out.println("Value Successfully Inserted");
            }else {
                System.out.println("Cell Already Occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index to access array");
        }
    }

    // Array Traversal
    public void traverseArray(){
        try{
            for(int i=0; i<arr.length;i++){
//                System.out.println("Array item " + i + " = " + arr[i]);
                System.out.print(arr[i] + " ");
            }
        }catch(Exception e){
            System.out.println("Array no longer exists");
        }
    }

    // Search for element in a given array
    public void searchInArray(int value){
        for(int i = 0; i< arr.length;i++){
            if(value == arr[i]){
                System.out.println( "Element " + value + " is in the array at index " + i);
                return;
            }
        }
        System.out.println( "Element " + value + " is NOT in the array");
    }

    // Delete element in a given array
    public void deleteInArray(int valueIndex){
        try{
            arr[valueIndex] = Integer.MIN_VALUE;
            System.out.println("Value Deleted Successfully");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Value index not available");
        }

    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
