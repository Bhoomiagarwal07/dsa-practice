/*
Problem: Linear Search
Difficulty: Easy

Problem Statement:
Given an array of integers and a target element, determine whether
the target element is present in the array.

Approach:
1. Traverse the array from the first element to the last.
2. Compare each element with the target.
3. If an element matches the target, return true.
4. If the entire array is traversed without finding the target, return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LinearSearch {
    public static boolean  search(int arr[] , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={10,-5,20,86,4};
        int target = 5;
        System.out.println(search(arr, target));
    }
}
