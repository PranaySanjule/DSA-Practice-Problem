//level : easy

package com.pranay;

public class reverseString {
    // GFG Qustion : Reverse a String => (https://practice.geeksforgeeks.org/problems/reverse-a-string/1)

    public static void main(String[] args) {
        String str = "GEEKS";
        System.out.print(reverseWord(str));

    }
        public static String reverseWord(String str)
        {
            // Normal Approach
            // Reverse the string str
            char[] ch = str.toCharArray();
            char[] new_Arr = new char[ch.length];
            int j = 0;
            for (int i=ch.length-1;i>=0;i--){
                new_Arr[j] = ch[i];
                j++;
            }

            String string = new String(new_Arr);
            return string;
        }

        // Time Complexity : O(S)

}
