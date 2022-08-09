//leetcode (Easy) : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package com.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class findAllNumDisappered {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.print(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
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
                ans.add(index+1);
            }
        }

        return ans;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
