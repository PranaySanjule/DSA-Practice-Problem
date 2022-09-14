package com.placement;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int size;

        System.out.print("Enter size of array : \n");
        size = in.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter elements of array : ");

        for (int i = 0;i<size;i++){
            nums[i] = in.nextInt();
        }

        System.out.println("Enter a target :");
        int target = in.nextInt();

        System.out.println(binarySearch(nums, target));

    }

    static int binarySearch(int[] arr, int target){

        int s = 0;
        int e = arr.length-1;

        while ( s <= e){
            int mid = s+(e-s)/2;

            if(target < arr[mid]){
                e = mid - 1;
            }else if(target > arr[mid]){
                s = mid+1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
