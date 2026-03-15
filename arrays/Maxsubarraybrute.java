// leetcode Maximum Subarray 
// approach = Bruteforce
// time complexity O(n^3)
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
  for(int i = 0;i<n;i++){
    for(int j = i;j<n;j++){
      int sum = 0;
      for(int k = i;k<=j;k++){
        sum += nums[k];
        maxsum = Math.max( maxsum , sum);
      }
    }
  }
      return maxsum;
    }
  }
  
    
