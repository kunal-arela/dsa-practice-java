/**
 * Problem: Maximum Subarray
 * Algorithm: Kadane's Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
import java.util.*;
public class Subarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = input.nextInt();
        }
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int maxSum = nums[0];
        int currentSum = 0;
        for(int num : nums){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
        }
  return maxSum;
    }
}
         
