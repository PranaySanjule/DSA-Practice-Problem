package com.OopsProperties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = 45;
    }

    public BoxWeight(double len, double width, double height, double weight){
        super(len, width, height);
        this.weight = weight;
    }
}
