package com.BasicPractice.Recurion;

public class factorial {
    public static void main(String[] args) {
        int factorial = fact(5);
        System.out.print(factorial);
    }

    static int fact(int n){

        if(n <= 1){         // if(n==0 || n==1)
            return 1;
        }

        return n * fact(n-1);
    }

}

/*
Debugging is more important.

 */
