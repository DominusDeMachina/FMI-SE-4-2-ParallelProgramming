package com.company.gfx;

import com.company.primitives.Color;
import com.company.primitives.Ray;

public abstract class GfxObject {
  public Color color;
  public abstract double intersect(Ray ray);
}