package easy;

/*
Question: Given an array of 0s and 1s find the maximum number of maximum consecutive 1s.
Solution: Using two counters "count" and "Max" for keepping the count of consecutive 1s and max count respectively
*/

public class MaxConsecOnes {
    public static void main(String[] args) {
        int[] numbers = {1,1,0,1,1,1,0};
        System.out.println("Consecutive Ones -->"+ findMaxConsecOnes(numbers));
    }

    static int findMaxConsecOnes(int[] nums){
        int count = 0;
        int max = count;
        for (int i = 0; i<nums.length-1; i++){
            if(nums[i]==1){
                count++;
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
