/*
Allocate minimum number of pages
GFG (HARD) : https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
InterviewBit (MEDIUM) : https://www.interviewbit.com/problems/allocate-books/

Refer Video : https://www.youtube.com/watch?v=gYmWHvRHu-s

 */
package com.Array;

public class AllocateBook {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int ans = books(arr, 2);
        System.out.print(ans);
    }

    public static int books(int[] A, int B) {
        //Your code here
        int low = Integer.MAX_VALUE;
        int high = 0;

        for(int i=0;i<A.length;i++){

            high += A[i];
        }

        for(int i=0;i<A.length;i++){
            if(low > A[i]){
                low = A[i];
            }
        }

        int res = -1;

        while(low<=high){

            int mid = low + (high - low)/2;
            if(allocationIsPossible(mid, A, B)){
                res = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }

        return res;
    }

    public static boolean allocationIsPossible(int barrier, int[] arr, int K){

        int allocatedStu = 1;
        int pages = 0;

        for(int i=0;i<arr.length;i++){


            if(pages + arr[i] <= barrier){
                pages += arr[i];
            }else{
                allocatedStu +=1;
                if(allocatedStu > K || arr[i]>barrier){
                    return false;
                }
                pages = arr[i];
            }

        }

        if(K > arr.length){
            return false;
        }

        return true;
    }
}
