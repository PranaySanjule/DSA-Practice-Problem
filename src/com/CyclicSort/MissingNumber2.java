//GFG (Easy) : https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1

package com.CyclicSort;

public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};

        System.out.print(MissingNumber(arr));

    }
    public static int MissingNumber(int arr[]) {

        int i=0;
        while(i < arr.length){
            int correctIdx = arr[i]-1;
            if(correctIdx < arr.length && arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }else {
                i++;
            }
        }

        for(int j=0;j< arr.length;j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }

        return arr.length+1;

    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
