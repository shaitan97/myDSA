package easy;

/**
 * LeetCode 5: Longest Palindromic Substring
 * Given a string s, return the longest palindromic substring in s.
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "cbbd";
        System.out.println("Longest Palindrome Substring: " + longestPalindrome(str));
    }
    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return s;
        }
        String maxPalindromeStr = "";
        for(int window = 1; window< s.length(); window++) {
            for (int i = 0, j = window; j< s.length(); i++, j++) {
                if(isPalindrome(s, i, j)) {
                    if(maxPalindromeStr.length() < (j - i + 1)) {
                        System.out.println("Palindrome: " + s.substring(i, j+1) + " Start: " + i + " End: " + j);
                        maxPalindromeStr = s.substring(i, j+1);
                    }
                }
            }
        }
        return maxPalindromeStr;
    }

    public static boolean isPalindrome(String str,int start,int end) {

        if(start == end)
            return true;

        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        if(start < end + 1) {
           isPalindrome(str, start+1, end-1);
        }
        return true;
    }
}
