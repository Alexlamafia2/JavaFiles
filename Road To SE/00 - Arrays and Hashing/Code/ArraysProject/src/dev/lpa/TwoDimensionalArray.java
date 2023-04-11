package dev.lpa;

public class TwoDimensionalArray {
    int arr[][] = null;

    public TwoDimensionalArray(int rows, int columns) {
        this.arr = new int[rows][columns];
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValue(int row, int column, int value){
        try{
            if(arr[row][column] == Integer.MIN_VALUE){
                arr[row][column] = value;
                System.out.println("Value successfully inserted");
            }else{
                System.out.println("This cell is already occupied");
            };
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D Array");
        }
    }

    public void accessCell(int row, int column){
        System.out.println("Accessing row# " + row + ", column# " + column);
        try{
            System.out.println("Cell value is " + arr[row][column]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid cell values");
        }

    }

    public void traverse2DArray() {
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void searchingValue(int value){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length; j++){
                if (arr[i][j] == value){
                    System.out.println("Value is found at row " + i + " col " + j);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    public void deleteValue(int row, int column){{
        try{
            System.out.println("Successfully deleted: " + arr[row][column]);
            arr[row][column] = Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid row and column values");
        }
    }

    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }


}
