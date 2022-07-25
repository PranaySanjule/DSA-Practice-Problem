//Level : Easy
package com.pranay;

import java.util.Arrays;

public class reverseArray {
//    Question : Reverse the Array (GFG => https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/)

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = reverse(arr);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] reverse(int[] arr){
        int[] new_Arr = new int[arr.length];
        int j = 0;
        for (int i=arr.length-1;i>=0;i--){
            new_Arr[j] = arr[i];
            j++;
        }

        return new_Arr;
    }
}
