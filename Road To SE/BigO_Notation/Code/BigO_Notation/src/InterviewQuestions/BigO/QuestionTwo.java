package InterviewQuestions.BigO;

public class QuestionTwo {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        printPairs(myArray);
    }

    private static void printPairs(int[] array){
        for(int i = 0; i<array.length;i++){
            for(int j = 0; j < array.length;j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}
