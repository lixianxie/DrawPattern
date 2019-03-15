package com.lxie;

public class DrawTest {

    public static void main(String args[]) {
        new DrawControllerImpl(ShapeFactory.createShape("Square")).draw();
    }
}
