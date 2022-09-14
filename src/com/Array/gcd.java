package com.Array;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        size = in.nextInt();

        int[] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        System.out.println(sumOfGCD(4, arr));
    }

    static int sumOfGCD(int k, int[] arr){
        int sum = 0;

        for (int i=0;i<arr.length;i++){
            sum = sum + gcd(k,arr[i]);
        }

        return sum;
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }

}
