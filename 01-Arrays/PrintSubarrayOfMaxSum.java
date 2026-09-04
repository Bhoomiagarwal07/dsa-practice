/*
 * Problem: Print Subarray of Maximum Sum
 *
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given an array of integers, find the starting and ending indices
 * of the contiguous subarray having the maximum sum.
 *
 * Approach:
 * 1. Use Kadane's Algorithm to find the maximum subarray sum.
 *
 * 2. Maintain:
 *    - sum      -> current subarray sum
 *    - maxi     -> maximum sum found so far
 *    - start    -> starting index of the current subarray
 *    - ansStart -> starting index of the maximum-sum subarray
 *    - ansEnd   -> ending index of the maximum-sum subarray
 *
 * 3. Whenever sum becomes 0, set the current index as the start
 *    of a new subarray.
 *
 * 4. Add the current element to sum.
 *
 * 5. If sum becomes greater than maxi, update maxi and store
 *    the current subarray's starting and ending indices.
 *
 * 6. If sum becomes negative, reset sum to 0 because a negative
 *    sum cannot contribute positively to a future subarray.
 *
 * 7. Return ansStart and ansEnd as an array containing the
 *    starting and ending indices of the maximum-sum subarray.
 *
 * Example:
 * arr = {-2, -3, 4, -1, -2, 1, 5, -3}
 *
 * Maximum-sum subarray = {4, -1, -2, 1, 5}
 * Maximum sum = 7
 * Starting index = 2
 * Ending index = 6
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class PrintSubarrayOfMaxSum {

    public static int[]  maxSum(int arr[]){
        
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int sum =0;
        int start = 0;
       
        int ansStart = -1;
        int ansEnd = -1;

        for(int i=0;i<n;i++){
            if(sum == 0){
                start =i;
            }
            sum = sum+ arr[i];
            if(sum>maxi){
                maxi = sum;
                ansStart = start;
                ansEnd =i;
            }
            if(sum<0){
                sum =0;
            }
        }
        return new int[]{ansStart , ansEnd};



    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int ans[] = maxSum(arr);

        for(int num :ans){
            System.out.print(num+" ");
        }
    }
}
