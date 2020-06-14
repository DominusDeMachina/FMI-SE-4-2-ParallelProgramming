package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        int width = 640;
        int height = 480;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // add pixel color
            }
        }

        final long endTime = System.nanoTime();

        System.out.println("Work time: " + (endTime-startTime)/1000000000.0F);
    }
}
