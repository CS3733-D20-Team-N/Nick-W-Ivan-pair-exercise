package edu.wpi.teamname;

public class Rectangle {
  double len;
  double width;

  public Rectangle(double len, double width) {
    this.len = len;
    this.width = width;
  }

  public double getPerimeter() {
    if (this.len >= 0 && this.width >= 0) {
      return (2 * this.len + 2 * this.width);
    }
    return 0;
  }

  public double getArea() {
    if (this.len >= 0 && this.width >= 0) {
      return (this.len * this.width);
    }
    return 0;
  }
}
