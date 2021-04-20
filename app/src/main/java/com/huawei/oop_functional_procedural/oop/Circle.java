package com.huawei.oop_functional_procedural.oop;

public class Circle implements Shape {
    public static final double PI = 3.14;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculate() {
        return PI* radius;
    }
}
