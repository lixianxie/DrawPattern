package com.lxie;

public class ShapeFactory {

    public static Shape createShape(String s) {
        Shape shape = null;
        if(s.equals("Circle")) {
            shape =  new Circle();
        }
        else if(s.equals("Square")) {
            shape = new Square();
        }
        //.....
        return shape;
    }
}
