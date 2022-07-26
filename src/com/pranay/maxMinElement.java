/*
Maximum and minimum of an array using minimum number of comparisons


 */

package com.pranay;

public class maxMinElement {
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};

        System.out.println("The Minimum element is " + MinElement(arr));
        System.out.print("The Maximum element is " + MaxElement(arr));
    }

    // Minimum Element
    public static int MinElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    // Maximum Element
    public static int MaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

}
