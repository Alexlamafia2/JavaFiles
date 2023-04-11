public class Main {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int counter = 1;
        for(int i = 0; i < intArray.length; i++ ){
            if(intArray[i]>counter){
                System.out.println(counter);
                return;
            }
            counter++;
        }
    }
}
