// GFG PROBLEM : Find position of an element in a sorted array of infinite numbers
// link to understand logic : https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=15&t=5283s
// IDE : https://ide.geeksforgeeks.org/58c3b1f5-7d87-4a4e-bc80-8c14f3395c9b
package com.Array;

public class FindElementOfInfiniteArray {
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};

        int target = 10;
        System.out.print(findingRange(arr,target));
    }

    static int findingRange(int[] arr, int target){
        int start = 0;
        int end = 1;

        //important condition for target
        while(target > arr[end]){
            int newStart = end + 1;

            //end formula => previous end + sizeof new array box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end){

        while (start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
