// leetCode (MEDIUM) Problem : https://leetcode.com/problems/search-in-rotated-sorted-array/
// Detailed Explanation : https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=15&t=8995s

// GFG Problem : https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array0959/1
package com.pranay;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.print(search(arr, 0));
    }


    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if you did not find a pivot, it means the array is not rotated
        if(pivot == -1){
            //just do normal binary search
            return BinarySearch(nums, target, 0, nums.length-1);
        }

        // if pivot is found, you have found 2 ascending sorted arrays
        //
        if(nums[pivot]==target){
            return pivot;
        }

        if(target >= nums[0]){
            return BinarySearch(nums, target, 0, pivot - 1);
        }

        return BinarySearch(nums, target, pivot+1, nums.length-1);
    }

    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            // find the middle element
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;

            //4 Cases over here
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }



//      METHOD 2 : easy and normal solution
//         int i=0;
//         for(int arr:nums){
//             if(arr==target){
//                 return i;
//             }
//             i++;
//         }

//         return -1;
}
