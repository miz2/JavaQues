import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        // check for 0's
        int n = nums.length;
        int j = 0; // Initialize j to keep track of the position to place non-zero elements
        
        // Find the first non-zero element
        while (j < n && nums[j] != 0) {
            j++;
        }
        
        // If all elements are non-zero or the array is empty, no need to proceed
        if (j == n) {
            return;
        }
        
        // Start shifting non-zero elements to the left
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // Move non-zero element to the j-th position
                nums[j] = nums[i];
                // If i is not equal to j, set nums[i] to 0
                if (i != j) {
                    nums[i] = 0;
                }
                j++; // Increment j to the next position
            }
        }
    }
}

public class MoveXero{
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.println("Original array: " + Arrays.toString(nums1));
        solution.moveZeroes(nums1);
        System.out.println("After moving zeroes: " + Arrays.toString(nums1));

        int[] nums2 = {1, 0, 0, 3, 0, 5};
        System.out.println("\nOriginal array: " + Arrays.toString(nums2));
        solution.moveZeroes(nums2);
        System.out.println("After moving zeroes: " + Arrays.toString(nums2));

        int[] nums3 = {0, 0, 0, 0, 0};
        System.out.println("\nOriginal array: " + Arrays.toString(nums3));
        solution.moveZeroes(nums3);
        System.out.println("After moving zeroes: " + Arrays.toString(nums3));

        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println("\nOriginal array: " + Arrays.toString(nums4));
        solution.moveZeroes(nums4);
        System.out.println("After moving zeroes: " + Arrays.toString(nums4));
    }
}
