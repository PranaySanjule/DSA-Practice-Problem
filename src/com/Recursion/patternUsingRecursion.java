package com.Recursion;

public class patternUsingRecursion {
    public static void main(String[] args) {
        triangle2(4,0);
    }

    static void triangle1(int r, int c){

        /*

        *
        * *
        * * *
        * * * *
        * * * * *

         */

        if(r == 0){
            return;
        }

        if(c < r){
            triangle1(r, c+1);
            System.out.print("*");
        }else{
            triangle1(r-1,0);
            System.out.println();
        }
    }

    static void triangle2(int r, int c){
        /*

        * * * * *
        * * * *
        * * *
        * *
        *

         */

        if(r==0){
            return;
        }

        if(c < r){
            System.out.print("* ");
            triangle2(r, c+1);
        }else {
            triangle2(r-1, 0);
            System.out.println();
        }

    }
}
