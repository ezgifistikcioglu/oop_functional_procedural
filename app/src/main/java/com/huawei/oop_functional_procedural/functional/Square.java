package com.huawei.oop_functional_procedural.functional;

public class Square{
    public double side;
    public String name;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    public double areaCalculate() {
        return side * side;
    }
}
