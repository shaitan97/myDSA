package easy;


/*
*
* Given an array of integers arr, return true if and only if it is a valid mountain array.

* Recall that arr is a mountain array if and only if:
    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
    arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    *

* Constraints:
    1 <= arr.length <= 104
    0 <= arr[i] <= 104
*
* */

public class MountainArray {
    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println(validMountainArray(nums));
    }

    public static boolean validMountainArray(int[] arr) {
        int max=0, maxIndex=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                maxIndex = i;
            }
        }

        System.out.println("max="+max+" maxInd="+maxIndex);

        if (maxIndex == arr.length-1 || maxIndex ==0)
            return false;

        for(int i=0; i<maxIndex; i++){
            System.out.println("before "+ arr[i]);
            if(arr[i]>=arr[i+1])
                return false;
        }

        for(int i=maxIndex; i<arr.length-1; i++){
            System.out.println("after "+ arr[i]);
            if(arr[i]<=arr[i+1])
                return false;
        }

        return true;
    }
}
