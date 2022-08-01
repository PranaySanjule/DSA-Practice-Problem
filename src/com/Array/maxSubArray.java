/*
KADANE'S ARRAY

Leetcode Problem : 53. Maximum Subarray.     (MEDIUM PROBLEM : https://leetcode.com/problems/maximum-subarray/ )

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Input: nums = [-2,-2,-3,-4]
Output: -2

*/

package com.Array;

import java.util.Arrays;

public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {-1,-4,-2,-1};

        int ans = maxSubArray(arr);
        System.out.print(ans);
    }

    public static int maxSubArray(int[] nums) {

        int curSum = 0;
        int maxSum = 0;

        for(int i=0;i<nums.length;i++){
            curSum = curSum + nums[i];
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }

        // logic for negative array
        // 1) Return the maximum element of negative array or element which less than 0 and max of array
            if(maxSum == 0){
                Arrays.sort(nums);
                return nums[nums.length-1];
            }

        return maxSum;
    }

}
