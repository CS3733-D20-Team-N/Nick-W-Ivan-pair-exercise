package edu.wpi.teamname;

import java.lang.Math.*;

public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getPerimeter() {
    if (this.radius >= 0) {
      return 2 * radius * Math.PI;
    }
    return 0;
  }

  public double getArea() {
    if (this.radius >= 0) {
      return radius * radius * Math.PI;
    }

    return 0;
  }
}
