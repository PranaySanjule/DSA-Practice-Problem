//leetcode (Medium) : https://leetcode.com/problems/find-all-duplicates-in-an-array/
package com.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.print(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] arr) {

        int i=0;
        while(i < arr.length){
            int correctIdx = arr[i]-1;
            if(arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index=0;index < arr.length;index++){
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }

        return ans;
    }

    //swap function
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
