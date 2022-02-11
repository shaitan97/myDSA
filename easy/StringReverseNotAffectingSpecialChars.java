package easy;

/*
Q -> Given a string, reverse it without changing the position of the special chars.
A -> 1. Initialize two pointers left and right.
     2. start traversing the string from both the ends
     3. Check if left is not a special char then move ahead, left++
     4. Check Elseif right is not a special char theb move ahead, right++
     5. Else swap left and right.
*/

public class StringReverseNotAffectingSpecialChars {
    public static void main(String[] args) {
        String str = "sandesh@Nagrale";
        System.out.println("Original -->"+str);
        char[] strArr = str.toCharArray();
        reverseStr(strArr);
        str = new String(strArr);
        System.out.println("Reversed -->"+str);

    }

    public static void reverseStr(char[] strArr ){
        int left=0, right=strArr.length-1;
        while (left<right){
            if (!Character.isAlphabetic(strArr[left])){
                left++;
            }
            if (!Character.isAlphabetic(strArr[right])){
                right--;
            }
            else {
                char temp = strArr[left];
                strArr[left] = strArr[right];
                strArr[right] = temp;
                left++; right--;
            }
        }

    }
}
