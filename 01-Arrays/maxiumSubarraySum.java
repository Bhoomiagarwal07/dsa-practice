/*
 * Problem: Maximum Subarray Sum
 *
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given an array of integers, find the maximum possible sum
 * of a contiguous subarray.
 *
 * Approach:
 * 1. Use Kadane's Algorithm to find the maximum subarray sum.
 *
 * 2. Maintain:
 *    - currSum -> sum of the current subarray
 *    - maxSum  -> maximum sum found so far
 *
 * 3. Add each element to currSum.
 *
 * 4. Update maxSum whenever currSum becomes greater than maxSum.
 *
 * 5. If currSum becomes negative, reset it to 0 because a negative
 *    sum will reduce the sum of any subarray that follows it.
 *
 * 6. If all elements are negative, currSum will keep getting reset.
 *    Therefore, find and return the largest element in the array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class maxiumSubarraySum {

    public static int maxSum(int arr[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum>maxSum){
                maxSum = currSum;
            }
            if(currSum<0){
                currSum =0;
            }
        }

        if(maxSum < 0){
            maxSum = Integer.MIN_VALUE;

            for(int num :arr){
                if(num>maxSum){
                    maxSum = num;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println(maxSum(arr));
    }
}
