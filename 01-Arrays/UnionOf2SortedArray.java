/*
Problem: Union of Two Sorted Arrays
Difficulty: Easy

Problem Statement:
Given two sorted arrays, find their union. The union should contain
all distinct elements from both arrays in sorted order.

Approach:
1. Use two pointers, 'i' for arr1 and 'j' for arr2.
2. Compare the elements at arr1[i] and arr2[j].
3. Add the smaller element to the result and move its pointer forward.
4. If both elements are equal, add the element only once and move both pointers.
5. Before adding an element, check the last element of the result to avoid duplicates.
6. After one array is completely traversed, add the remaining distinct elements
   from the other array.
7. Return the resulting ArrayList.

Time Complexity: O(n1 + n2)
Space Complexity: O(n1 + n2)
*/

import java.util.*;
public class UnionOf2SortedArray {
    public static ArrayList<Integer> union(int arr1[] , int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){

                if(ans.isEmpty() || ans.get(ans.size()-1) != arr1[i] ){
                    ans.add(arr1[i]);
                    
                }
                i++;}

                else if(arr2[j]<arr1[i]){

                    if(ans.isEmpty() || ans.get(ans.size()-1)!= arr2[j]){
                        ans.add(arr2[j]);
                       
                    }
                     j++;
                }
                else{
                    if(ans.isEmpty() || ans.get(ans.size()-1)!= arr2[j]){
                         ans.add(arr1[i]);
                   
                    }
                     i++;
                    j++;
                    
                   
                }
            
        }
    
        //append remaining elements
        while(i<n1){
            if(ans.isEmpty() || ans.get(ans.size()-1)!= arr1[i]){
                  ans.add(arr1[i]);
                  
            }
             i++;
          
        }

        while(j<n2){
            if(ans.isEmpty() || ans.get(ans.size() -1)!= arr2[j]){
                ans.add(arr2[j]);
           
            }
             j++;
            
        }

        return ans;
    }
    public static void main(String[] args) {
                int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> ans = new ArrayList<>();
        ans = union(arr1, arr2);

        for(int num :ans){
            System.out.print(num+" ");
        }

    }
}
