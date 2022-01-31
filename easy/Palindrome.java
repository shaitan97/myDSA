package easy;

import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {
        //driver code
        String palindrome = "SANDESH";
        System.out.println(palindrome + " is a palindrome = "+isPalindrome(palindrome));

    }

    //recursive function
    static boolean isPalindromeRecursive(String str, int start, int end){
        //return if there is only one char
        if (start == end)
            return true;
        //not a palindrome if first and last char not equal
        if (str.charAt(start) != str.charAt(end))
            return false;
        //if equal then compare further
        if (start < end+1){
            isPalindromeRecursive(str,start+1,end-1);
        }

        return true;
    }

    //calling function
    static boolean isPalindrome(String str){
        int n = str.length();
        return isPalindromeRecursive(str.toLowerCase(Locale.ROOT),0,n-1);
    }

}
