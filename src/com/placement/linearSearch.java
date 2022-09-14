package com.placement;

import java.util.*;

public class linearSearch {
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

        System.out.println(linearsearch(nums, target));

    }

    static int linearsearch(int[] arr, int target){

        for(int i = 0; i < arr.length;i++){

            if(arr[i] == target){
                return i;
            }

        }

        return -1;
    }
}
