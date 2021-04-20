package com.huawei.oop_functional_procedural.functional;

import java.util.ArrayList;
import java.util.List;

public class Geometry {

    public static void main(String[] args) {

        List<Square> shape = new ArrayList<>();
        shape.add(new Square("square1",8.2));
        shape.add(new Square("square2",13.2));
        shape.add(new Square("square3",16.2));
        shape.add(new Square("square4",20.2));
        shape.add(new Square("square5",26.2));
        printShapes(shape,300);
    }


    public static void printShapes(List<Square> shapes, int areaAverage)
    {
        shapes.stream()
            .filter(shape-> shape.areaCalculate() < areaAverage)
            .forEach(shape -> System.out.println(shape.name + " area : " +  shape.areaCalculate()));
    }
}
