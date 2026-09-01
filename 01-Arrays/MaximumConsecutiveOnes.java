/*
Problem: Maximum Consecutive Ones
Difficulty: Easy

Problem Statement:
Given a binary array containing 0s and 1s, find the maximum number
of consecutive 1s present in the array.

Approach:
1. Traverse the array from left to right.
2. If the current element is 1, increment the consecutive count.
3. If the current element is 0, reset the count to 0.
4. After each element, update the maximum count found so far.
5. Return the maximum number of consecutive 1s.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MaximumConsecutiveOnes {

    public static int maxiOnes(int arr[]){
        int count =0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else {
                count =0;
            }
            maxi = Math.max(maxi , count);
        }
        return Math.max(maxi , count);
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1};
        System.out.println(maxiOnes(arr));
    }
}
