public class Main {
    public static void main(String[] args) {
        int[] intArray = {60,20,80,40,50};
        int temp = 0;
        int result = 0;
        int elementOne = 0;
        int elementTwo = 0;
        int[] arrayResult[];
        for(int i = 0; i<intArray.length - 1;i++){
            for(int j = i + 1; j < intArray.length;j++){
                result = intArray[i] * intArray[j];
                if(result > temp){

                    temp = result;
                    elementOne = intArray[i];
                    elementTwo = intArray[j];
                }
            }
        }

        System.out.println("(" + elementOne +"," + elementTwo + ")");
    }
}
