// GFG Basic Problem : Cyclically rotate an array by one

package com.pranay;

import java.util.Arrays;

public class cyclicallyRotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        for(int i=1;i<n;i++){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}
