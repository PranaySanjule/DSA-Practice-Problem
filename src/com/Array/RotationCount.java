package com.Array;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,0,1};
        System.out.print(countRotation(arr));
    }


    public static int countRotation(int[] arr) {
        int pivot = findPivotWithDuplicates(arr);
        return pivot + 1;
    }

    // It will not work to find PIVOT  in Duplicate Array. (Pivot means largest element of a array)
//    static int findPivot(int[] arr){
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end){
//            int mid = start + (end - start)/2;
//
//            //4 Cases over here
//            if(mid < end && arr[mid] > arr[mid+1]){
//                return mid;
//            }
//
//            if(mid > start && arr[mid] < arr[mid-1]){
//                return mid - 1;
//            }
//
//            if(arr[mid] <= arr[start]){
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//
//        return -1;
//    }


    // Also work for normal array without any duplicates.
    // Program to find Pivot with Duplicate Element. (Pivot means largest element of a array)
    // Find Pivot with Duplicates
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;

            //4 Cases over here
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[start] > arr[end])) {
                start = mid + 1;
            }else {
                end = end - 1;
            }

        }

        return -1;
    }
}
