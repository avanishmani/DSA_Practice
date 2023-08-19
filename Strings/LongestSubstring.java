package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longestSubstringLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> uniqueChars = new HashSet<>();

        while (right < n) {
            char currentChar = s.charAt(right);

            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
                right++;
                longestSubstringLength = Math.max(longestSubstringLength, uniqueChars.size());
            } else {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }

        return longestSubstringLength;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String For which You want LongestSubstring !");
        String s=sc.next();
        LongestSubstring ll=new LongestSubstring();
        System.out.println( ll.lengthOfLongestSubstring(s));
    }
}
