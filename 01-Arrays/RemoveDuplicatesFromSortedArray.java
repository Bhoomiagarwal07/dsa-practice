/*
Problem: Remove Duplicates from Sorted Array

Approach:
- Use two pointers: i and j.
- 'i' keeps track of the position of the last unique element.
- 'j' scans through the array.
- Whenever arr[j] is different from arr[i], it is a new unique element.
- Place it at arr[i + 1] and move i forward.
- Return i + 1 as the number of unique elements.

Time Complexity: O(n)
Space Complexity: O(1)

Approach: Two Pointer
*/

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int arr[]){

       int n = arr.length;
       int i=0;
       for(int j=1;j<n;j++){
        if(arr[i]!=arr[j]){
            arr[i+1]=arr[j];
            i++;
        }
       }
       return i+1;
    

    }
    public static void main(String args[]){
        int arr[] = {1,1,2,2,2,3,3};
        int k =removeDuplicates(arr);

        for(int i =0;i<k;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
