package com.BasicPractice.Recurion;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.print(SumOfDigits(1234));
    }

    static int SumOfDigits(int n){
        if(n == 0){
            return 0;
        }

        return SumOfDigits(n/10) + (n%10);
    }
}
