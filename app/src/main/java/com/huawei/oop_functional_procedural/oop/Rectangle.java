package com.huawei.oop_functional_procedural.oop;

public class Rectangle implements Shape{
    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double areaCalculate() {
        return width * height;
    }
}


