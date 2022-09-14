package com.Array;

import java.util.Scanner;

public class CreditLimits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int[] arr = new int[k];

        for (int i=0;i<k;i++){
            arr[i] = in.nextInt();
        }


        int n = in.nextInt();
        int[] stud = new int[n];
        for (int i=0;i<n;i++){
            stud[i] = in.nextInt();
        }

        System.out.print(creditLimits(k,arr,n,stud));
    }


    public static int creditLimits(int k, int[] arr, int n, int[] stud) {

        int ans = 0;

        for (int i=0;i<k;i++){
            for (int j=0;j<n;j++){
                if(stud[j] >= arr[i]){
                    ans = ans + 1;
                }
            }
        }

        return ans;
    }


}
