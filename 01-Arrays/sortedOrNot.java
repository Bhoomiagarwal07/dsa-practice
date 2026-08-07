/*
Problem: Check if an Array is Sorted
Difficulty: Easy

Problem Statement:
Given an array of integers, determine whether the array is sorted
in non-decreasing (ascending) order.

Approach:
1. Traverse the array from the second element.
2. Compare each element with its previous element.
3. If the current element is smaller than the previous one,
   the array is not sorted.
4. If no such pair is found, the array is sorted.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class sortedOrNot {
    public static boolean check(int arr[]){
        int n = arr.length;
        boolean flag = true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                flag = false;
                return flag;
            }
        }

        return flag;
    }

    public static void main(String args[]){
        int arr[]  = {4,5,10,12,30};
        System.out.println(check(arr));
    }
}
