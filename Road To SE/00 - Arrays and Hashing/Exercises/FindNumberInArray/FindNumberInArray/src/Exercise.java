public class Exercise {
    int[] array;

    public Exercise(int[] array) {
        this.array = array;
    }

    public void findNumberInArray(int numberToFind){
        for(int i = 0; i < array.length; i++){
            if(numberToFind == array[i]){
                System.out.println("Number was found at index: " + i);
                return;
            }
        }
        System.out.println("Number was not found");

    }


}
