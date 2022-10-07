package com.OopsProperties.inheritance;

public class Main {
    public static void main(String[] args) {
        //object for constructor 1
        Box box = new Box();
        System.out.println(box.len + " " + box.height + " " + box.width);

        //object for constructor 2
        Box box1 = new Box(9.5);
        System.out.println(box1.len + " " + box1.height + " " + box1.width);

        //object for constructor 3
        Box box3 = new Box(4.5,2.5,5.2);
        System.out.println(box3.len + " " + box3.width + " "+ box3.height);

        BoxWeight boxW = new BoxWeight();
        System.out.println(boxW.len + " " + boxW.width + " " + boxW.height + " " + boxW.weight);

        BoxWeight boxW1 = new BoxWeight(2, 3, 4, 8);
        System.out.println(boxW1.height + " " + boxW1.weight);
    }
}
