package Leetcode.RemoveElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3}; // Input array
        int val = 0; // Value to remove
        int[] expectedNums = new int[4]; // The expected answer with correct length.
        // It is sorted with no values equaling val.

//        int k = Arrays.removeElement(nums, val); // Calls your implementation

//        assert k == expectedNums.length;
        Arrays.sort(nums, 0, k); // Sort the first k elements of nums
//        for (int i = 0; i < actualLength; i++) {
//            assert nums[i] == expectedNums[i];
//        }
    }
}
