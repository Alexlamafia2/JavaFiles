public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,5,4,3};
        int[] array2 = {5,1,2,3,4};
        permutationOne(array1,array2);
        permutationTwo(array1,array2);

    }

    public static void permutationOne(int[] array1, int[] array2){
        int counter = 0;
        if(array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++){
                for (int j = 0; j < array2.length; j++){
                    if(array1[i] == array2[j]){
                        counter++;
                    }
                }
            }
            if(counter == array1.length){
                System.out.println("It is a permutation");
            }else{
                System.out.println("It is NOT a permutation");
            }
        }else{
            System.out.println("Different Array Sizes");
        }
    }

    public static void permutationTwo(int[] array1, int[] array2){
        int counter = 0;
        if(array1.length == array2.length) {
            int sum1 = 0;
            int sum2 = 0;
            int mul1 = 1;
            int mul2 = 1;
            for(int i = 0; i < array2.length; i++){
                sum1 += array1[i];
                sum2 += array2[i];
                mul1 += array1[i];
                mul2 += array2[i];

            }

            if(sum1 == sum2 && mul1 == mul2){
                System.out.println("It is a permutation");
            }else{
                System.out.println("it is NOT a permutation");
            }

        }else{
            System.out.println("Different Array Sizes");
        }
    }
}
