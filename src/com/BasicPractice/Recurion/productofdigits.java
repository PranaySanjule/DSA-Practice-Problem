package com.BasicPractice.Recurion;

public class productofdigits {
    public static void main(String[] args) {
        System.out.println(ProductOfDigits(1234));
    }

    static int ProductOfDigits(int n){
        if(n%10 == n){
            return n;
        }

        return ProductOfDigits(n/10) * (n%10);
    }
}
