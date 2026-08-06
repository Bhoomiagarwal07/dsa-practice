/*
Problem: Largest and Second Largest Element in an Array
Platform: GeeksforGeeks
Link: https://www.geeksforgeeks.org/problems/second-largest3735/1

Difficulty: Easy

Problem Statement:
Given an array of integers, return the largest and the second largest
distinct element present in the array.

Approach:
- Traverse the array only once.
- Maintain two variables:
    largest and secondLargest.
- Update them whenever a larger element is found.
- Ignore duplicate values while finding the second largest.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
public class largestElement {
    
    public static int[] largest(int arr[]){
       int largest = Integer.MIN_VALUE;
       int sLargest = Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            sLargest = largest;
            largest = arr[i];
        }
        else  if( arr[i]!=largest && arr[i]>sLargest){
            sLargest=arr[i];
        }
       }
       
       return new int[] {largest,sLargest};
    }

    public static void main(String args[]){
        int arr[] = {10,-6,85,45,33};
        int res[] = largest(arr);
        for(int num:res){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
