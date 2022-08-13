/*
leetcode(Hard) : https://leetcode.com/problems/first-missing-positive/
GFG (Medium) : https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
InterviewBit (Medium) : https://www.interviewbit.com/problems/first-missing-integer/


 */

package com.CyclicSort;

public class firstMissingPositive {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIdx = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIdx]){
                swap(nums, i, correctIdx);
            }else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                return index+1;
            }
        }

        //case 2
        return nums.length+1;
    }

    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
