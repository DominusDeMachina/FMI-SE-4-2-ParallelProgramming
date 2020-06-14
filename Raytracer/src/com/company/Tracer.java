package com.company;

import com.company.primitives.Color;
import com.company.primitives.Point3D;
import com.company.primitives.Ray;
import com.company.primitives.Vector3D;

public class Tracer {
  public void trace(int x, int y) {
    Ray ray = new Ray(
        new Point3D(1.0 * (x - Main.scene.canvas.width / 2 + 0.5), 1.0 * (y - Main.scene.canvas.height / 2 + 0.5), 100),
        new Vector3D(0.0, 0.0, -1.0));
    double min = Double.MAX_VALUE;
    Color color = Main.scene.background;

    for (int i = 0; i < Main.scene.objects.size(); i++) {
      double intersect = Main.scene.objects.get(i).intersect(ray);
      if (intersect != 0.0 && intersect < min) {
        color = Main.scene.objects.get(i).color;
        min = intersect;
      }
    }

    Main.image.bufferedImage.setRGB(x, Main.scene.canvas.height - y - 1, color.toInteger());
    // Color color = new Color(0.0F, 0.0F, 0.0F);
    // for (int row = 0; row < 8; row++) {
    // for (int col = 0; col < 8; col++) {
    // Ray ray = new Ray(
    // new Point3D(x - Main.scene.canvas.width / 2 + (col + 0.5) / 8, y -
    // Main.scene.canvas.height / 2 + (col + 0.5) / 8, 100),
    // new Vector3D(0.0, 0.0, -1.0));
    // if (sphere1.intersect(ray) != 0.0) {
    // color.add(sphere1.color);
    // }
    // }
    // }
    // color.divide(64);
    // image.bufferedImage.setRGB(x, y, color.toInteger());
  }
}