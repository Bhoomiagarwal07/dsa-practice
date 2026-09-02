/*
Problem: Longest Subarray with Sum 0
Difficulty: Medium

Problem Statement:
Given an array of integers, find the length of the longest
subarray whose sum is equal to 0.

Approach:
1. Use a HashMap to store each prefix sum and its first occurrence index.
2. Traverse the array while maintaining the running prefix sum.
3. If the prefix sum becomes 0, the subarray from index 0 to i has sum 0.
4. If the prefix sum already exists in the map, the elements between
   the previous index + 1 and i have sum 0.
5. Calculate the length and update the maximum length.
6. Store a prefix sum only when it appears for the first time to get
   the longest possible subarray.
7. Return the maximum length found.

Time Complexity: O(N)
Space Complexity: O(N)
*/

import java.util.*;
public class longestSubarrayWithGivenSum0 {

    public static int lengthOfLongestSubarray(int arr[] ){
        HashMap<Integer , Integer> map = new HashMap<>();

        int maxi =Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==0){
                maxi = i+1;
            }

            else{
                if(map.containsKey(sum)){
                    maxi = Math.max(maxi , i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] ={9, -3, 3, -1, 6, -5};
        System.out.println(lengthOfLongestSubarray(arr));
    }
}
