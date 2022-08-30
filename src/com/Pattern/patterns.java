package com.Pattern;

public class patterns {
    public static void main(String[] args) {
        pascalTriangle(4);
//        pattern33(4);
//        pattern30(5);
//        pattern28(5);
//        pattern17(4);
//        pattern6(5);
//        pattern5(5);
//        pattern4(5);
//        pattern3(5);
//        pattern2(4);
//        pattern1(4);
    }

    static void pattern33(int n){
        /*

        4 4 4 4 4 4 4 4 4
        4 3 3 3 3 3 3 3 4
        4 3 2 2 2 2 2 3 4
        4 3 2 1 1 1 2 3 4
        4 3 2 1 0 1 2 3 4
        4 3 2 1 1 1 2 3 4
        4 3 2 2 2 2 2 3 4
        4 3 3 3 3 3 3 3 4
        4 4 4 4 4 4 4 4 4

         */

        int originalN = n;

        n = 2 * n;
        for (int row = 0;row <= n; row++){

            for (int col=0;col <= n; col++){

                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }

    }

    static void pattern32(int n) {

        /*

        0 0 0 0 0 0 0 0 0
        0 1 1 1 1 1 1 1 0
        0 1 2 2 2 2 2 1 0
        0 1 2 3 3 3 2 1 0
        0 1 2 3 4 3 2 1 0
        0 1 2 3 3 3 2 1 0
        0 1 2 2 2 2 2 1 0
        0 1 1 1 1 1 1 1 0
        0 0 0 0 0 0 0 0 0

         */



        n = 2 * n;
        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <= n; col++) {

                int atEveryIndex =  Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();

        }
    }

    static void pattern31(int n){

        /*

        4 4 4 4 4 4 4 4
        4 3 3 3 3 3 3 4
        4 3 2 2 2 2 3 4
        4 3 2 1 1 2 3 4
        4 3 2 1 1 2 3 4
        4 3 2 2 2 2 3 4
        4 3 3 3 3 3 3 4
        4 4 4 4 4 4 4 4

         */

        int originalN = n;

        n = 2 * n;
        for (int row = 0;row <= n; row++){

            if(row == 4){
                continue;
            }

            for (int col=0;col <= n; col++){

                if(col  == 4){
                    continue;
                }

                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }


    //Method to calculate the nCr value
    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }
    //Method to calculate the factorial of the number
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }


    // Pascal Triangle
    static void pascalTriangle(int n){
        /*

            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1

         */

        for(int row=1;row<=n;row++){

            for (int spaces = 1; spaces <= n - row;spaces++){
                System.out.print(" ");
            }

            for (int col=1;col<=row;col++){
                    System.out.println(nCr(row,col) + " ");
            }
            System.out.println();
        }

    }

    static void pattern30(int n){

        /*

                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5

         */

        for (int row = 1;row<=n;row++){

            for (int spaces=0; spaces<n-row;spaces++){
                System.out.print("  ");
            }

            for (int col=row;col>=1;col--){
                System.out.print(col + " ");
            }
            for (int col=2;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();

        }

    }


    static void pattern28(int n){

        /*

            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *

         */

        for (int row=0;row<2*n;row++){

            int totCol = 0;
            if(row>n){
                totCol = 2*n - row;
            }else{
                totCol = row;
            }

            int totSpaces = n - totCol;

            for (int spaces = 0; spaces<totSpaces;spaces++){
                System.out.print(" ");
            }

            for (int col = 0;col<totCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern17(int n){
        /*

             1
            212
           32123
          4321234
           32123
            212
             1

         */

        for (int row=1;row<=2*n;row++){

            int c = row > n ? 2*n - row: row;

            for (int spaces=0; spaces < n-c;spaces++){
                System.out.print("  ");
            }

            for (int col=c;col>=1;col--){
                System.out.print(col + " ");
            }
            for (int col=2;col<=c;col++){
                System.out.print(col + " ");
            }
            System.out.println();

        }

    }


    static void pattern6(int n){

        /*

                *
               **
              ***
             ****
            *****

         */

        for (int row=1;row<=2*n-1;row++){

            for (int col=n;col>=1;col--){
//                if(col > row && ){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("* ");
//                }

            }
            System.out.println();

        }

    }

    static void pattern5(int n){

        /*

        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *

         */
        for (int row=0;row<2*n;row++){

            int totCol = 0;
            if(row>n){
                totCol = 2*n - row;
            }else{
                totCol = row;
            }

            for (int col = 0;col<totCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){

        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */
        for (int row=1;row<=n;row++){

            for (int col = 1;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){

        /*

        * * * * *
        * * * *
        * * *
        * *
        *

         */

        //for row
        for (int row=1;row<=n;row++){

            //for col
            for (int col=row;col<=n;col++){     // Other logic : for(int col = 1; col <= n-row+1; col++)
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern2(int n){

        /*

        *
        * *
        * * *
        * * * *

         */

        //for row
        for (int row=1;row<=n;row++){

            //for col
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    static void pattern1(int n){

        /*

        * * * *
        * * * *
        * * * *

         */

        //for row
        for (int i=1;i<=n;i++){

            //for col
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
