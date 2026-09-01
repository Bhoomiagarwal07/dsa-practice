// package dsa-practice.02-Strings;


/*
Problem: Isomorphic Strings
Link: https://leetcode.com/problems/isomorphic-strings/
Difficulty: Easy

Problem Statement:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if every character in s maps to exactly
one character in t, and no two different characters map to the same character.

Approach:
- If the lengths of both strings are different, return false.
- Use two HashMaps:
  1. map1: stores mapping from s -> t.
  2. map2: stores mapping from t -> s.
- Traverse both strings simultaneously.
- If neither character has been mapped before:
    - Create mappings in both HashMaps.
- Otherwise:
    - Verify that the existing mappings are consistent in both directions.
    - If not, return false.
- If the entire traversal completes successfully, return true.

Time Complexity: O(n)
- Traverse both strings once.

Space Complexity: O(n)
- Two HashMaps store character mappings in the worst case.
*/
import java.util.*;
public class IsomorphicString {
    public static boolean isIsomorphicString(String s1 ,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        HashMap<Character , Character > map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(!map1.containsKey(c1) && !map2.containsKey(c2)){
                map1.put(c1,c2);
                map2.put(c2,c1);
            }
            else if (map1.getOrDefault(c1,'#') != c2 || map2.getOrDefault(c2, '#')!=c1){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s1= "paper";
        String s2 = "title";

        System.out.println(isIsomorphicString(s1, s2));
        
    }
    
}
