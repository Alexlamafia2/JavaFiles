import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        twoSum(nums,target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){

                if(nums[i] + nums[j] == target){
                    if(i == j){
                        continue;
                    }
                    result[0] = i;
                    result[1] = j;
                    System.out.println(Arrays.toString(result));
                    return result;
                }
            }
            System.out.println("==========================================");
        }

        return null;
    }
}
