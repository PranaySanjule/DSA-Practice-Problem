/*
Leetcode Problem : https://leetcode.com/problems/find-smallest-letter-greater-than-target/

744. Find Smallest Letter Greater Than Target

Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

Input: letters = ["c","f","j"], target = "a"
Output: "c"

Input: letters = ["c","f","j"], target = "c"
Output: "f"

Input: letters = ["c","f","j"], target = "d"
Output: "f"

Constraints:

2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.

 */


package com.pranay;

public class smallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};

        System.out.print(nextGreatestLetter(arr, 'j'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;


        while(start<=end){

            // Binary Search Approch

            int mid = start + (end - start)/2;      // always take mid inside the loop else u will not getting output

            if(target < letters[mid]){      // always if - else_if and else condition in Binary Seach else u will get error.
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
