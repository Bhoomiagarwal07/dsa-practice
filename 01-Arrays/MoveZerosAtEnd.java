/*
Problem: Move Zeros to End
Difficulty: Easy

Problem Statement:
Given an array of integers, move all zeros to the end of the array
while maintaining the relative order of the non-zero elements.

Approach:
1. Find the first zero in the array and keep its index in 'l'.
2. Traverse the array from the element after 'l'.
3. Whenever a non-zero element is found, swap it with arr[l].
4. Move 'l' forward to the next position.
5. If no zero is present, the array remains unchanged.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MoveZerosAtEnd {

    public static void moveZeros(int arr[]){
        int l =-1;
        for(int index = 0;index<arr.length;index++){
            if(arr[index]==0){
                l = index;
                break;
            }
        }
        
        for(int r = l+1;r<arr.length;r++){
            if(arr[r]!=0){
                int temp = arr[r];
                arr[r]= arr[l];
                arr[l] = temp;
                l++;
            }
        }
    }
    public static void main(String args[]){
        int arr[] ={1,0,2,3,0,4,0,1};
         moveZeros(arr);
         for(int num:arr){
            System.out.print(num+" ");
         }
    }
}
