/*
LeetCode : EASY / MEDIUM
GFG (Easy) : https://practice.geeksforgeeks.org/problems/peak-element/1?

EASY : https://leetcode.com/problems/find-peak-element/
MEDIUM : https://leetcode.com/problems/peak-index-in-a-mountain-array/

Watch to revise : https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=15
*/

package com.Array;

public class peakElement {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5};
        System.out.print(findPeakElement(arr));
    }

    static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end -start)/2;

            if(arr[mid] > arr[mid+1]){
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }else {
                // you are in ascending part of array
                start = mid + 1; //bcoz we know that mid + 1 element > mid element
            }
        }

        // in the end, start == end  and pointing to the largest number bcoz of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one bcoz that is what the checks say
        // more elaboration at every point of time for start and end, they have the possible answer till that time
        // and if we are saying that only one item is remaining, hence bcoz of above line that is the best possible ans

        return start; // or return end, both are equal
    }
}
