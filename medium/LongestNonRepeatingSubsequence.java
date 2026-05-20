package medium;

/**
 * LeetCode 3: Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestNonRepeatingSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 1;
        int maxSize = 0;
        if(s.isEmpty() || s.length() == 1){
            return s.length();
        }

        while(end < s.length()) {
            System.out.println("Substring: " + s.substring(start, end) + " Start: " + start + " End: " + end);
            if(s.substring(start, end).contains(String.valueOf(s.charAt(end)))) {
                start = s.indexOf(s.charAt(end), start) + 1;
            }
            end+=1;
            maxSize = Math.max(maxSize, end - start);
            System.out.println("MaxSize: " + maxSize);
        }

        return maxSize;
    }
}
