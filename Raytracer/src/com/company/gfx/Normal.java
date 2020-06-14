package com.company.gfx;

public class Normal {
  public double x, y, z;

  public Normal() {
    x = 0.0;
    y = 0.0;
    z = 0.0;
  }

  public Normal(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public Normal(Point2D point) {
    this.x = point.x;
    this.y = point.y;
    this.z = point.z;
  }

  public double dot(Normal normal) {
    return x * normal.x + y * normal.y + z * normal.z;
  }

  public void normalize() {
    double magnitude = Math.sqrt(x * x + y * y + z * z);

    x /= magnitude;
    y /= magnitude;
    z /= magnitude;
  }
}