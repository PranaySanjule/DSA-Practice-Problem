package com.Array;

public class kadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-1 ,-2 ,-3 ,-4};
        int ans = maxSubarraySum(arr, arr.length);
        System.out.print(ans);
    }

    static int maxSubarraySum(int arr[], int n){

        int curSum = 0;
        int maxSum = 0;

        for(int i=0;i<arr.length;i++){
            curSum = curSum + arr[i];
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
            countSort(arr, arr.length);
            return arr[arr.length-1];
        }

        return maxSum;
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
