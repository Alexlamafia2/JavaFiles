package dev.lpa;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        daysAboveAverage();
    }

    private static void daysAboveAverage(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temperatures: ");
        String input = scanner.nextLine();
        int days = Integer.parseInt(input.trim());
        double[] array = new double[days];
        double totalOfDays = array.length;
        double  sum = 0;
        for(int i = 0; i < days; i++){
            System.out.println("Day " + (i+1) + "'s high temp: ");
            String inputTwo = scanner.nextLine();
            array[i] = Integer.parseInt(inputTwo.trim());
            sum += array[i];
        }

        double average = sum/totalOfDays;
        System.out.println("Average = " + average);

        int counter = 0;
        for(int i = 0; i< array.length;i++){
            if(array[i] > average){
                counter++;
            }
        }
        System.out.println(counter + " Days above average");
    }
}
