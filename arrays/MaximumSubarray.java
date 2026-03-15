/**
 * Problem: Maximum Subarray
 * Algorithm: Kadane's Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
import java.util.*;
public class subarray{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] nums = new int[size];
        for(int i = 0;i<size;i++){
            nums[i] = input.nextInt();
        }
        System.out.println(maxsubarray(nums));
    }
    public static int maxsubarray(int [] nums){
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += nums[i];
            if(maxsum < sum ){
                maxsum = sum;
            }if(sum < 0){
                sum = 0;
            }
        }
        return maxsum;
    }
}
