package com.lxie;

public class DrawControllerImpl implements DrawController {

    private Shape shape;

    public DrawControllerImpl (Shape shape) {
        this.shape = shape;
    }

    private static void preprocessing() {
        System.out.println("preprocessing...");
    }

    private static void postprocessing() {
        System.out.println("postprocessing...");
    }

    //assume pre/post are invoked every draw, and independent of shapes
    //decorator pattern.
    @Override
    public void draw() {
        preprocessing();
        shape.draw();
        postprocessing();
    }
}
