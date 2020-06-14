package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        Random random = new Random();

        int width = 640;
        int height = 480;

        File traceResultFile = new File("TraceResult.png");
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                bufferedImage.setRGB(x,y,random.nextInt());
            }
        }

        try {
            ImageIO.write(bufferedImage, "PNG", traceResultFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        final long endTime = System.nanoTime();

        System.out.println("Work time: " + (endTime-startTime)/1000000000.0F);
    }
}
