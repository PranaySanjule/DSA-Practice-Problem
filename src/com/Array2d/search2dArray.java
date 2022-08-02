//LEETCODE (MEDIUM) PROBLEM : https://leetcode.com/problems/search-a-2d-matrix/
// LEETCODE (MEDIUM) PROBLEM : https://leetcode.com/problems/search-a-2d-matrix-ii/
package com.Array2d;

public class search2dArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1}
        };

        System.out.print(search(matrix, 0));
    }
    static boolean search(int[][]matrix, int target){
        int r = 0;
        int c = matrix[r].length - 1;

        while(r < matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }

        return false;
    }
}
