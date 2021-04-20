package com.huawei.oop_functional_procedural.oop;


public class Square implements Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double areaCalculate() {
        return side * side;
    }
}
