package com.company.gfx;

public class Point {
    public double x,y,z;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    public Point add(Point point) {
        return new Point(x + point.x, y + point.y, z + point.z);
    }
    public Point sub(Point point) {
        return new Point(x - point.x, y - point.y, z - point.z);
    }
}
