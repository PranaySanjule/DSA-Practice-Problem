//level : medium

package com.pranay;

public class ceilingNumber {
    // Question : Find the ceiling of a number
    // Ceiling => find the smallest element in array which is greater than or equal to target element.
    // Condition => if target is not present in array, then return element which is greater than target.

    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18,20}; //sorted array : approach binary search
        System.out.print(ceiling(arr,15));

    }

    static int ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;


        while(start<=end){

            int mid = start + (end - start)/2;      // always take mid inside the loop else u will not getting output

            if(target < arr[mid]){      // always if - else_if and else condition in Binary Seach else u will get error.
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }

        return arr[start];
    }
}
