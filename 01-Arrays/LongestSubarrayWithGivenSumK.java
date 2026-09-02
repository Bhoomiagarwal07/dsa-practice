/*
Problem: Longest Subarray with Given Sum K
Difficulty: Medium

Problem Statement:
Given an array of positive integers and an integer K,
find the length of the longest subarray whose sum is equal to K.

Approach:
1. Use two pointers, left and right, to maintain a sliding window.
2. Keep track of the sum of elements inside the current window.
3. If the sum becomes greater than K, move the left pointer
   and subtract elements until sum <= K.
4. If the sum becomes equal to K, update the maximum length.
5. Move the right pointer forward and add the new element to the sum.
6. Return the maximum length found.

Time Complexity: O(2N) ≈ O(N)
Space Complexity: O(1)
*/

public class LongestSubarrayWithGivenSumK {

    public static int lengthOfLongestSubarray(int arr[] , int k){
        int sum =arr[0];
        int left =0;
        int right =0;
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;

        while(right<n){

            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }

            if(sum==k){
                maxi = Math.max(maxi , right-left+1);
            }

            right++;
            if(right<n){
                sum+=arr[right];
            }
            
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,1,1,1,1,4,2,3};

        int k =3;
       System.out.println(lengthOfLongestSubarray(arr, k)); 
    }
}
