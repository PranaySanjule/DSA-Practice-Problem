package com.Array;

import java.util.Arrays;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(arr)));

    }

    static int[] frequencySort(int[] nums){

        int maxElement = 0;

        for (int k = 0; k < nums.length; k++){

            maxElement = Math.max(nums[k], maxElement);
        }

        int[] count = new int[maxElement+1];
//        count[0] = 0;

        for (int i=0; i<nums.length;i++){
            count[nums[i]]++;
        }

        for (int j=0; j<nums.length;j++){
//            if()
        }

        return count;
    }
}
