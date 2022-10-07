package com.oops;

public class javaClasses {
    public static void main(String[] args) {
        Student students = new Student();

//        Student pranay; // just declaring reference variable pranay to the object Student.
//        pranay = new Student();

        Student pranay = new Student();

//        System.out.println(pranay.rollno);
//        System.out.println(pranay.stuName);
//        System.out.println(pranay.marks);

//        pranay.greetings();

        System.out.println(pranay.num());
//        pranay.greeting();
    }
}

// create a class Student => Class is a named group of properties and functions.
//  or Class is a template of an object.
class Student{
    int rollno;     // rollno is a instance variable
    String stuName;
    float marks;

//    Student (int rno, String naam, float per){
//        this.rollno = 30;
//        this.stuName = "Pranay Sanjule";
//        this.marks = 83.40f;
//    }

    void greetings(){
        System.out.println("My name is " + stuName);
    }

    Student (){
        rollno = 30;
        stuName = "Pranay Sanjule";
        marks = 83.40f;
    }

    int num(){
        int n = 45;
        return n;
    }

}
