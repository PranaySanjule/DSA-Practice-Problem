package com.String;

public class StringBasic {
    public static void main(String[] args){
        String name = "Pranay Sanjule";
        String a = "pranay";
        String b = "sanjule";

        if(a == b){
            System.out.println("false");
        }

        String result = a.concat(b);
        System.out.println(result);

        String str = "This is \"string\" class";
        System.out.println(str);


        a = a.concat("sanjule");
        System.out.println(a);
    }
}
