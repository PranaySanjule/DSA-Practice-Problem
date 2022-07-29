/*
LeeCode (MEDIUM) Problem : https://leetcode.com/problems/kth-largest-element-in-an-array/
215. Kth Largest Element in an Array

Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
You must solve it in O(n) time complexity.


 */


package com.pranay;

import java.util.Arrays;

public class kthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.print(findKthLargest(nums,2));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
