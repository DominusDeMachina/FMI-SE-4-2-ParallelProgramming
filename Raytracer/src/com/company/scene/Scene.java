package com.company.scene;

import java.util.ArrayList;

import com.company.gfx.GfxObject;
import com.company.gfx.Plain;
import com.company.gfx.Sphere;
import com.company.primitives.Color;
import com.company.primitives.Normal;
import com.company.primitives.Point3D;

public class Scene {
  public Canvas canvas;
  public ArrayList<GfxObject> objects;
  public Color background;

  public Scene(int width, int height, double size) {
    canvas = new Canvas(width, height, size);
    background = new Color(0.0F, 0.0F, 0.0F);
    objects = new ArrayList<GfxObject>();
    objects.add(new Sphere(new Point3D(0.0, 0.0, 0.0), 50, new Color(1.0F, 0.0F, 0.0F)));
    objects.add(new Sphere(new Point3D(-200.0, 0.0, 0.0), 50, new Color(0.0F, 1.0F, 0.0F)));
    objects.add(new Sphere(new Point3D(200.0, 0.0, 0.0), 50, new Color(0.0F, 0.0F, 1.0F)));
    objects.add(new Plain(new Point3D(0.0, 0.0, 0.0), new Normal(0.0, 1.0, 0.2), new Color(1.0F, 1.0F, 0.0F)));
  }
}