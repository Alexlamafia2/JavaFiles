package InterviewQuestions.BigO;

public class QuestionTen {
    public static void main(String[] args) {
        powersOfTwo(50);
    }

    private static int powersOfTwo(int n){
        if(n<1){
            return 0;
        } else if (n==1) {
            return 1;
        }else {
            int prev = powersOfTwo(n/2);
            int curr = prev*2;
            System.out.println(curr);
            return curr;
        }
    }
}
