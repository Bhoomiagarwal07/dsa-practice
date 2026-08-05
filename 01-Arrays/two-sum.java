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

import java.util.HashMap;

public class two_sum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
