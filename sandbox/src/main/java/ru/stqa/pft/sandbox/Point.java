package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {

    this.x = x;
    this.y = y;
  }

  public double distance(Point p2) {
    return Math.sqrt((this.y - this.x) * (this.y - this.x) + (p2.y - p2.x) * (p2.y - p2.x));
  }

}




