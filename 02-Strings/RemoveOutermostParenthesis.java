// package dsa-practice.02-Strings;


/*
Problem: Remove Outermost Parentheses
Link: https://leetcode.com/problems/remove-outermost-parentheses/
Difficulty: Easy

Problem Statement:
Given a valid parentheses string, remove the outermost parentheses
from every primitive valid parentheses substring and return the result.

Approach:
- Use a counter (depth) to track the current nesting level.
- For every '(':
  - If depth is greater than 0, append it to the result.
  - Then increase the depth.
- For every ')':
  - First decrease the depth.
  - If depth is still greater than 0, append it to the result.
- This skips only the outermost opening and closing parenthesis of
  each primitive substring.

Time Complexity: O(n)
- Traverse the string once.

Space Complexity: O(n)
- StringBuilder stores the resulting string.
*/

import java.util.*;
public class RemoveOutermostParenthesis {
    public static String removeParenthesis(String s){
        StringBuilder result = new StringBuilder("");
        int level =0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(level>0){
                    result.append(ch);
                }
                level++;
            }
            else {
                level--;
                if(level>0){
                    result.append(ch);
                }
            }

        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(removeParenthesis(s));
    }
}
