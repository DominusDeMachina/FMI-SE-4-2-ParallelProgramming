package com.company.gfx;

import com.company.primitives.Color;
import com.company.primitives.Normal;
import com.company.primitives.Point3D;
import com.company.primitives.Ray;

public class Plain extends GfxObject {

  Point3D point;
  Normal normal;

  public Plain(Point3D point, Normal normal, Color color) {
    this.point = new Point3D(point);
    this.normal = new Normal(normal);
    this.color = new Color(color);
  }

  /**
   * (p-a)*n=0; (o+td-a)*n=0; td*n + (o-a)*n = 0; td*n=(a-o)*n; t=(a-o)*n/d*n;
   */
  @Override
  public double intersect(Ray ray) {
    double t = point.sub(ray.origin).dot(normal) / ray.direction.dot(normal);
    if (t > 10E-9) {
      return t;
    } else {
      return 0.0;
    }
  }
}