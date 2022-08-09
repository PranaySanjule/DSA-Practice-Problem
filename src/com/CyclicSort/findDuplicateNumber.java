package com.CyclicSort;

public class findDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        System.out.print(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums){

        // METHOD 1 : USE CYCLIC SORT
        int i=0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int correctIdx = nums[i]-1;
                if(nums[i] != nums[correctIdx]){
                    swap(nums, i, correctIdx);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }

        return -1;

    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
