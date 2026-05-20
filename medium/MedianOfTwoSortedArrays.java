package medium;

import java.util.Arrays;

/**
 * LeetCode 4: Median of Two Sorted Arrays
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 */
public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {6,7,8,9,10,11,12,13,14,15,16,17};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int n = nums1.length;
        int m = nums2.length;
        System.out.println("n = " + n + " m = " + m);
        if(n ==0 && m == 0) {
            return 0.0;
        }
        if(n == 0) {
            if(m%2==0) {
                return (nums2[(m/2)-1] + nums2[m/2])/2;
            } else return nums2[m/2];
        }
        if (m==0) {
            if(n%2==0){
                return (nums1[(n/2)-1] + nums1[n/2])/2;
            } else return nums1[n/2];

        } else {
            int [] arr = new int[(m+n)];
            int p1 = 0;
            int p2 = 0;
            int i;
            for( i = 0; i < m+n ; i++) {
                if(p1 == n || p2 == m) {
                    break;
                }
                else if(nums1[p1] < nums2[p2]) {
                    arr[i] = nums1[p1];
                    p1++;
                } else if (nums2[p2] < nums1[p1]) {
                    arr[i] = nums2[p2];
                    p2++;
                } else {
                    // When elements are equal, take from nums1
                    arr[i] = nums1[p1];
                    p1++;
                }
                System.out.println("Arr = " + arr[i] + " p1 = " + p1 + " p2 = " + p2);
            }
            if(p1 < n ) {
                while(p1 < n) {
                    System.out.println("p1 = " + p1 + " i = " + i);
                    arr[i] = nums1[p1];
                    i++;
                    p1++;
                }
            }
            if(p2 < m) {
                while(p2 < m) {
                    System.out.println("p2 = " + p2 + " i = " + i);
                    arr[i] = nums2[p2];
                    i++;
                    p2++;
                }
            }

            if((m+n)%2 == 0 ) {
                Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
                System.out.println("Sum of lengths is even");
                System.out.println("m+n/2 = " + (m+n)/2);
                System.out.println("m+n/2 - 1 = " + (((m+n)/2) - 1));
                System.out.println("arr[(n+m/2) - 1] = " + arr[((n+m)/2) - 1] + " arr[(n+m)/2] ="+ arr[(n+m)/2]);
                median = (arr[((n+m)/2) - 1] + arr[(n+m)/2]) / 2.0;
            } else {
                System.out.println("Sum of lengths is odd");
                System.out.println("arr[(m+n)/2] = " + arr[(m+n)/2]);
                median = arr[(m+n)/2];
            }
        }
        System.out.println("Median:" + median);
        return median;
    }
}
