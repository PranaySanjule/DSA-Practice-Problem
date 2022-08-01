// Leetcode : https://leetcode.com/problems/sqrtx/
// GFG : https://practice.geeksforgeeks.org/problems/square-root/1
// InterviewBit : https://www.interviewbit.com/problems/square-root-of-integer/

package com.Array;

public class sqrt {
    public static void main(String[] args) {

        double ans = mySqrt(2147395600);
        System.out.print(ans);
    }

    // Function to calculate perfect square till precision 3
    static double mySqrt(int x) {
        int start = 0;
        int end = x;

        double root=0.0;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(mid*mid==x){
                return mid;
            }

            if(mid*mid > x){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }


        double incr = 0.1;
        for(int i = 0;i<3;i++){ // till 3rd precision
            while(root*root <= x){
                root += incr;
            }

            root -= incr;
            incr/=10;
        }

        return root;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    int search(int[] nums, int target, boolean firstOccurence){
        int ans = -1;

        // Binary Search
        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid +  1;
            }else{
                // main logic : if you get mid = target, then do this.
                ans = mid;
                if(firstOccurence){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }


    // Program to calculate sqrt in int and perfect round off
    // round off means : sqrt(8) = 2.8284 = 2   and sqrt(2147395600) = 46339.999 == 46339 or 46340
    public int sqrt(int A) {

        long start = 0;
        long end = A;
        long ans = 0;
        // double root=0.0;

        while(start<=end){
            long mid = start + (end - start)/2;

            if(mid*mid==A){
                return (int)mid;
            }

            if(mid*mid > A){
                end = mid - 1;
            }else{
                start = mid + 1;
                ans = mid;
            }
        }

        // CHECK LINK : https://leetcode.com/problems/sqrtx/

        return (int)ans;
    }
}
