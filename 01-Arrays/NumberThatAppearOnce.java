/*
Problem: Number That Appears Once
Difficulty: Easy

Problem Statement:
Given an array of integers where every element appears twice except
one element, find and return the element that appears only once.

Approach:
1. Create a HashMap to store each element and its frequency.
2. Traverse the array and count the frequency of every element.
3. Traverse the array again and check the frequency of each element.
4. If the frequency is 1, return that element.
5. If no element appears once, return -1.

Time Complexity: O(n)
Space Complexity: O(n)
*/


import java.util.*;
public class NumberThatAppearOnce {

    public static int findAppearOnce(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num:arr){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={1,1,2,3,3,4,4};

        System.out.println(findAppearOnce(arr));
    }
}
