// Leetcode (easy) : https://leetcode.com/problems/monotonic-array/

package com.Array;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.print(monotonic(nums));
    }

    public static boolean monotonic(int[] nums){
        return increasing(nums) || decreasing(nums);
    }

    public static boolean increasing(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static boolean decreasing(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                return false;
            }
        }

        return true;
    }
}
