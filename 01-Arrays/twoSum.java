/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/
Difficulty: Easy

Given an array of integers nums and an integer target, return indices of the
two numbers such that they add up to target.

Approach:
1. Brute force: check every pair -> O(n^2) time, O(1) space.
2. Optimized: use a HashMap to store (value -> index) as we iterate.
   For each number, check if (target - number) already exists in the map.
   -> O(n) time, O(n) space.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;
public class twoSum {
    public static int[] twoSumExists(int arr[] , int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
       
        for(int i=0;i<arr.length;i++){
            int reqSum = sum-arr[i];
            if(map.containsKey(reqSum)){
                return new int[] {map.get(reqSum),i};
            }
            else{
                map.put(arr[i],i);
            }
        }

        return new int[] {-1,-1};


    }
    public static void main(String args[]){
        int arr[] ={2,6,5,8,11};
        int target = 14;

        int res[] = twoSumExists(arr, target);
        for(int num : res){
            System.out.print(num+" ");
        }

        
    }
}
