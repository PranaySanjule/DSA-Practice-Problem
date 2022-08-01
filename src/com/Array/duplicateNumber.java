/*
Medium Level
Leetcode Problem : 287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.

Input: nums = [1,3,4,2,2]
Output: 2

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.

 */

package com.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicateNumber {
    public static void main(String[] args) {

        int[] nums = {1,2,4,1,5,4,3,2,1,6,7,8,9,2,20,4,6,25,10,11,12,25};   //{0,1,2,1,1)

        System.out.print(duplicates(nums, nums.length));

    }
//    public static int findDuplicate(int[] nums){
//        int max = nums[0];  //max = 3;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > max)
//                max = nums[i];
//        }
//
//        //max = 4
//
//        int[] count = new int[max + 1]; //4 + 1 = 5 => count[5]
//
//        // Initialize count array with all zeros.
//        for (int i = 0; i < max; ++i) { //
//            count[i] = 0;
//        }
//
//        // Store the count of each element
//        for (int i = 0; i < nums.length; i++) {
//            count[nums[i]]++;
//        }
//
//        int maxCount = count[0];
//        for (int i=0;i<count.length;i++){
//            if(count[i] > maxCount){
//                maxCount = count[i];
//            }
//        }
//
//        int ans = 0;
//        for (int i=0;i<count.length;i++){
//            if(maxCount == count[i]){
//                ans = i;
//            }
//        }
//
//        return ans;
//    }


    public static ArrayList<Integer> duplicates(int arr[], int n) {

        // code here
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }

        return list;
    }

    // Note : Code is not completed now.
}
