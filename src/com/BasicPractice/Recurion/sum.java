package com.BasicPractice.Recurion;

public class sum {
    public static void main(String[] args) {
        int totalsum = sum(5);
        System.out.print(totalsum);
    }

    static int sum(int n){

        if(n <= 1){         // if(n==0 || n==1)
            return 1;
        }

        return n + sum(n-1);
    }
}
