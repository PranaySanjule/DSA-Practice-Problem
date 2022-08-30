package com.Array2d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rotateImage {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotate(mat);

        System.out.println(Arrays.toString(mat));
    }

    public static void rotate(int[][] matrix){
        for(int row = 0;row<matrix.length;row++){
            for(int col = row;col<matrix[0].length;col++){
                int temp = matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix.length/2;col++){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[row][matrix.length-1-col];
                matrix[row][matrix.length-1-col]=temp;
            }
        }
    }
}
