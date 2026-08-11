// package dsa-practice.02-Strings;

/*
Problem: Longest Common Prefix
Link: https://leetcode.com/problems/longest-common-prefix/
Difficulty: Easy

Approach:
- Sort the array lexicographically.
- After sorting, the common prefix of the entire array will be the same as
  the common prefix of the first and the last strings.
- Compare characters of the first and last strings one by one.
- Stop at the first mismatch and return the prefix built so far.
- If all compared characters match, return the complete common prefix.

Time Complexity: O(n log n × m)
where:
- n = Number of strings
- m = Average length of a string
(Sorting dominates the time complexity.)

Space Complexity: O(1)
(Excluding the space used for the output string.)
*/
import java.util.*;
public class LongestCommonPrefix {  
    public static String longestPrefix(String s[]){
        StringBuilder sb = new StringBuilder(); 
        //sort lexiographically order
        Arrays.sort(s);

        String first = s[0];
        String last = s[s.length-1];

        for(int i=0;i<Math.min(first.length() ,last.length()) ;i++){
            if(first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }

            sb.append(first.charAt(i));
        }

        return sb.toString();


    }
    public static void main(String[] args) {
        String s[] = {"interview","internet","internal","interval"};
        System.out.println(longestPrefix(s));
        
    }
}
