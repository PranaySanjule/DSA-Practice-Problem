/*
Hint : Where to use cyclic sort
1) Apply Cyclic Sort when given 1 to N Range in a sorted or unsorted order


*/
package com.CyclicSort;

import java.util.Arrays;

public class cyclicSortAlgo {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        cyclicSort(nums);
        System.out.print(Arrays.toString(nums));
    }

    static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correctIdx = arr[i]-1;
            if(arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
