package easy;

import java.util.Arrays;

public class MaxConsecOnes {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1,1};
        Arrays.sort(numbers);


        System.out.println("Consecutive Ones -->"+ findMaxConsecOnes(numbers));
    }

    static int findMaxConsecOnes(int[] nums){
        int count = 0;
        int max = count;
        Integer letter;
        for (int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                letter = nums[i];
                if (max < count){
                    max = count;
                }
            }
            if (nums[i] == 0){
                count = 0;
            }
        }
        return max;
    }
}
