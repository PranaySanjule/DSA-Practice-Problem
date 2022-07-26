//level : medium

package com.pranay;

public class floorNumber {

    // Question : Find the floor of a number
    // Ceiling => find the greatest element in array which is smaller than or equal to target element.
    // Condition => if target is not present in array, then return element which is smaller than target.

    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18,20}; //sorted array : approach binary search
        System.out.print(floor(arr,1));

    }

    static int floor(int[] arr, int target){

        if(target < arr[0]){     // if target is last element in array
            return -1;
        }

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

        return arr[end];
    }
//    TIME COMPLEXITY : O(N)

}
