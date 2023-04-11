package InterviewQuestions.BigO;

import java.util.Arrays;

public class QuestionSix {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(reverseArray(myArray)));
    }

    private static int[] reverseArray(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length/2;i++){
            temp = array[i];
            array[i] = array[array.length-(i+1)];
            array[array.length-(i+1)] = temp;

        };
        return array;
    }
}

