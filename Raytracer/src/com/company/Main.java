package com.company;

import javax.imageio.ImageIO;

import com.company.gfx.Sphere;
import com.company.primitives.Color;
import com.company.primitives.Point3D;
import com.company.primitives.Ray;
import com.company.primitives.Vector3D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        final int width = 1600;
        final int height = 900;

        final File traceResultFile = new File("TraceResult.png");
        final BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Sphere sphere1 = new Sphere(new Point3D(0.0, 0.0, 0.0), 60.0, new Color(1.0F, 0.0F, 0.0F));

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = new Color(0.0F, 0.0F, 0.0F);
                for (int row = 0; row < 8; row++) {
                    for (int col = 0; col < 8; col++) {
                        Ray ray = new Ray(
                                new Point3D(x - width / 2 + (col + 0.5) / 8, y - height / 2 + (col + 0.5) / 8, 100),
                                new Vector3D(0.0, 0.0, -1.0));
                        if (sphere1.intersect(ray) != 0.0) {
                            color.add(sphere1.color);
                        }
                    }
                }
                color.divide(64);
                bufferedImage.setRGB(x, y, color.toInteger());
            }
        }

        try {
            ImageIO.write(bufferedImage, "PNG", traceResultFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        final long endTime = System.nanoTime();

        System.out.println("Work time: " + (endTime - startTime) / 1000000000.0F);
    }
}
