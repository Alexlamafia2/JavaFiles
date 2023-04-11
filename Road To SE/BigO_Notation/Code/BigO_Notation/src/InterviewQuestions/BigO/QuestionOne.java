package InterviewQuestions.BigO;

public class QuestionOne {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        sumProductOfArray(myArray);
    }

    private static void sumProductOfArray(int[] array){
        int sum = 0;
        int product = 1;
        for(int i = 0; i < array.length;i++){
            sum += array[i];
        }
        for(int i = 0; i < array.length;i++){
            product *= array[i];
        }

        System.out.println("Sum is: " + sum + "\nProduct is: " + product);
    }
}
