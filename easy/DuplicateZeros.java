package easy;

/*
* Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
* Note that elements beyond the length of the original array are not written. Do the above modifications to the input array
* in place and do not return anything.
* */

public class DuplicateZeros {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0};
        for(int i=0; i<arr.length ; i++ ){
            if(arr[i]==0 ){
                for(int j=arr.length-1; j>i+1; j--){
                    arr[j] = arr[j-1];
                }
                if(i+1 < arr.length)
                    arr[i+1]=0;
                i+=1;
            }
        }
    }
}
