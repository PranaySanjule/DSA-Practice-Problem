// Leetcode (easy) : https://leetcode.com/problems/set-mismatch/submissions/\
// InterviewBit (Medium) : https://www.interviewbit.com/problems/repeat-and-missing-number-array/

package com.CyclicSort;

import java.util.Arrays;

public class setMismatch {
    public static void main(String[] args) {
        int[] arr = {2,3,2};
        System.out.print(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        for(int index=0;index < nums.length;index++){
            if(nums[index]!=index+1){
                return new int[] {nums[index],index+1};
            }
        }

        return new int[] {-1,-1};

    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
