// package dsa-practice.02-Strings;


/*
Problem: Largest Odd Number in String
Link: https://leetcode.com/problems/largest-odd-number-in-string/
Difficulty: Easy

Approach:
- Traverse the string from right to left.
- Find the first digit that is odd.
- Since removing digits only from the end gives the largest possible odd number,
  return the substring from index 0 to that odd digit.
- If no odd digit is found, return an empty string.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class LargestOddNumberInString {
    public static String largestOdd(String s){
        int index =-1;
        int i;
        for(i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0') % 2 ==1){
                index = i;
                break;
            }
        }
        if(index ==-1){
            return "-1";
        }

        // skip leading zeros;
        i=0;
        while(i<=index && s.charAt(i)=='0'){
            i++;
        }
       
        return s.substring(i,index+1);
        

    }
    public static void main(String[] args) {
        String s = new String("01234568"); 
        System.out.println(largestOdd(s));

    }
}
