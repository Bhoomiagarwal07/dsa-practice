/*
 * Problem: Majority Element
 *
 * Difficulty: Easy
 *
 * Problem Statement:
 * Given an array, find the element that occurs more than n/2 times,
 * where n is the size of the array.
 * If no such element exists, return -1.
 *
 * Approach:
 * 1. Use the Boyer-Moore Voting Algorithm to find a possible
 *    majority element.
 *
 * 2. Maintain:
 *    - element -> current candidate for majority element
 *    - count   -> voting count of the candidate
 *
 * 3. If count becomes 0, choose the current array element as
 *    the new candidate.
 *
 * 4. If the current element is equal to the candidate, increase count.
 *
 * 5. Otherwise, decrease count because the different element
 *    cancels one vote of the candidate.
 *
 * 6. The Boyer-Moore algorithm gives us a possible candidate,
 *    but it does not guarantee that the candidate occurs more
 *    than n/2 times.
 *
 * 7. Traverse the array again and count the actual occurrences
 *    of the candidate.
 *
 * 8. If its frequency is greater than n/2, return the candidate.
 *    Otherwise, return -1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MajorityEleThatOccurMoreThanNBy2 {

    public static int majElement(int arr[]){

        int count =0;
        int element =0;
        int n = arr.length;

        for(int i=0;i<arr.length;i++){
            if(count == 0){
                count =1;
                element = arr[i];
                
            }
            else if(element == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int cnt1 = 0;
        for(int num :arr){
            if(num == element){
                cnt1++;
            }
        }

        if(cnt1 > n/2 ){
            return element;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majElement(arr));
    }
}
