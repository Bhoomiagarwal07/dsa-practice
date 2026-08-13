// package dsa-practice.02-Strings;



/*
Problem: Reverse Words in a String
Link: https://leetcode.com/problems/reverse-words-in-a-string/
Difficulty: Medium

Problem Statement:
Given an input string, reverse the order of the words.
A word is defined as a sequence of non-space characters.
The returned string should contain only a single space between words
and no leading or trailing spaces.

Approach:
- Traverse the string from right to left.
- Skip any extra spaces.
- Identify each word by finding its start and end indices.
- Extract the word using substring().
- Append the word to a StringBuilder.
- Add a single space between words (avoid leading/trailing spaces).

Time Complexity: O(n)
- Each character is visited at most once.
- substring() and append() together process each character only once overall.

Space Complexity: O(n)
- StringBuilder stores the final reversed string.
*/

import java.util.*;
public class ReverseWordsInString {
    public static String reverse(String s){
        StringBuilder result = new StringBuilder();

        int i =s.length()-1;
        while(i>=0){
            //skip spaces 

            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int end = i;

            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }

            //extract word
            String word = s.substring(i+1,end+1);

            if(result.length()>0){
                result.append(" ");
            }
            result.append(word);
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String s  = "Welcome to jungle    ";
        System.out.println(reverse(s));
        
    }
}
