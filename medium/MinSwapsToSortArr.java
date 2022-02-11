package medium;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.io.*;

/*
Q -> Given an array of non repeating numbers, find the minimum number of swaps required to sort the array.

A - > by brute force, copy the array in temp. sort the temp array. in a for loop compare the array with temp if not in place then swap
* */
public class MinSwapsToSortArr {

    public static void main(String[] args) {
        int[] array = {101, 758, 315, 730, 472,
                619, 460, 479};
        System.out.println("Number of Swaps required="+ swapCount(array) );
    }

    public static int swapCount(int[] arr) {
        int swaps=0;
        int[] temp = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(temp);
        for(int i=0; i<arr.length; i++){
            if (arr[i] != temp[i]){
                 swaps++;
                 swap(arr,i,indexOf(arr,temp[i]));
            }
        }
        return swaps;
    }

    public static void swap (int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static int indexOf(int [] ar, int element){
        int j;
        for (j=0; j<ar.length;j++){
            if (ar[j]==element)
                return j;
        }
        return -1;
    }

}
