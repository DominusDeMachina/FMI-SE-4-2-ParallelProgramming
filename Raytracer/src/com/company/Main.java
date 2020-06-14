package com.company;

import com.company.primitives.Image;
import com.company.scene.Scene;

public class Main {
    public static Scene scene;
    public static Image image;
    public static Tracer tracer;
    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        scene = new Scene(1600, 900, 1.0);
        image = new Image("TraceResult.png");
        tracer = new Tracer();

        for (int y = 0; y < scene.canvas.height; y++) {
            for (int x = 0; x < scene.canvas.width; x++) {
                tracer.trace(x,y);
            }
        }

        image.write("PNG");

        final long endTime = System.nanoTime();

        System.out.println("Work time: " + (endTime - startTime) / 1000000000.0F);
    }
}
