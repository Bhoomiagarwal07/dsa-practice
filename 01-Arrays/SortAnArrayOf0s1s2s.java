/*
 * Problem: Sort an Array of 0s, 1s and 2s
 *
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given an array containing only 0s, 1s and 2s, sort the array
 * in ascending order without using any sorting algorithm.
 *
 * Approach:
 * 1. Use the Dutch National Flag Algorithm with three pointers:
 *    - low  -> position where the next 0 should be placed
 *    - mid  -> current element being checked
 *    - high -> position where the next 2 should be placed
 *
 * 2. Maintain three regions:
 *    - [0 ... low-1]   -> all 0s
 *    - [low ... mid-1]  -> all 1s
 *    - [high+1 ... n-1] -> all 2s
 *
 * 3. If arr[mid] is 0:
 *    - Swap arr[mid] with arr[low].
 *    - Move both low and mid forward.
 *
 * 4. If arr[mid] is 1:
 *    - It is already in the correct middle region.
 *    - Move mid forward.
 *
 * 5. If arr[mid] is 2:
 *    - Swap arr[mid] with arr[high].
 *    - Move high backward.
 *    - Do not increment mid because the element swapped from
 *      high has not been checked yet.
 *
 * 6. Continue until mid crosses high.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SortAnArrayOf0s1s2s {

    public static void sort(int arr[]){
        int low =0;
        int mid =0;
        int high =arr.length-1;
        

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid]= temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;

            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,1,2,0,0,0,1};

        sort(arr);

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
