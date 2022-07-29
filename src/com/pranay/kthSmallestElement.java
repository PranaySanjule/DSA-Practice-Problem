/*
 level : medium
 Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest
 element in the given array. It is given that all array elements are distinct.

Input:
        N = 6
        arr[] = 7 10 4 3 20 15
        K = 3
        Output : 7
        Explanation :
        3rd smallest element in the given
        array is 7.

Expected Time Complexity: O(n)
        Expected Auxiliary Space: O(log(n))
        Constraints:
        1 <= N <= 105
        1 <= arr[i] <= 105
        1 <= K <= N
*/


package com.pranay;

public class kthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        System.out.print(kthSmallest(arr, 0, arr.length - 1, 3));


//        System.out.print(kthSmallest(arr,0, arr.length-1,3));         Approach 1
    }



    public static int kthSmallest(int[] arr, int l, int r, int k)
    {


//        Approach 2 : Problem => we need to find element in O(n) Time Complexity and it's T.C is O(nlogn)
//        so for few case it will not work.
//        Arrays.sort(arr);   // TIME COMPLEXITY : O(nlogn)
        countSort(arr, arr.length);
        return arr[k-1];

    }

    public static void countSort(int array[], int size) {
        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }
}
