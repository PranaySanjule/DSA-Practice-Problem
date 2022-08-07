// Leetcode (EASY) : https://leetcode.com/problems/missing-number/

package com.CyclicSort;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};  // 1 - N
        System.out.print(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIdx = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIdx]){
                swap(nums, i, correctIdx);
            }else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }

        //case 2
        return nums.length;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}