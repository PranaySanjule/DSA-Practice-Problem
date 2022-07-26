/*
Leetcode Problem (MEDIUM) : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

 */

package com.pranay;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.print(Arrays.toString(searchRange(nums, 8)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean firstOccurence){
        int ans = -1;

        // Binary Search
        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid +  1;
            }else{
                // main logic : if you get mid = target, then do this.
                ans = mid;
                if(firstOccurence){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

//    Time Complexity : O(logn)
}
