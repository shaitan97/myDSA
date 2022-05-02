package easy;

/*
* Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

    More formally check if there exists two indices i and j such that :
    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]
* */

import java.util.Hashtable;
import java.util.Map;

public class NumberAndItsDouble {

    public static void main(String[] args) {

        int[] nums = {-2,0,10,-19,4,6,-8};
        Map<Integer, Integer> hm = new Hashtable<>();

        for (int i = 0; i < nums.length; i++){
            hm.put(nums[i], i);
        }
        System.out.println("-->>"+hm);
        for ( int i =0; i< nums.length; i++) {
            int key = nums[i]*2;
            System.out.println("key=>"+key);
            Integer found = hm.get(key);
            System.out.println("found="+found);
            if (hm.containsKey(nums[i]*2))
                System.out.println("true");
        }
    }
}
