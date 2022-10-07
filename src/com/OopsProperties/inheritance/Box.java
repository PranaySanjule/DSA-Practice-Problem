package com.OopsProperties.inheritance;

public class Box {
    double len;
    double width;
    double height;
    
    Box(){
        this.len = -1;
        this.width = -1;
        this.height = -1;
    }

    //cube
    Box(double side){
        this.len = side;
        this.width = side;
        this.height = side;
    }

    Box(double l, double w, double h){
        this.len = l;
        this.width = w;
        this.height = h;
    }

    Box(Box old){
        this.len = old.len;
        this.width = old.width;
        this.height = old.height;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
