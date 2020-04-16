package edu.wpi.teamname;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {

  @Test
  public void perimeterTest() {
    Rectangle rectangle = new Rectangle(0, 0);
    Assertions.assertEquals(0, rectangle.getPerimeter());
  }

  @Test
  public void perimiterMaxTest() {
    Rectangle rectangle = new Rectangle(-1, -1);
    Assertions.assertEquals(0, rectangle.getPerimeter());
  }

  @Test
  public void permiterNormalTest() {
    Rectangle rectangle = new Rectangle(4, 5);
    Assertions.assertEquals(18, rectangle.getPerimeter());
  }

  @Test
  public void zeroArea() {
    Rectangle rectangle = new Rectangle(0, 0);
    Assertions.assertEquals(0, rectangle.getArea());
  }

  @Test
  public void negArea() {
    Rectangle rectangle = new Rectangle(-1, -1);
    Assertions.assertEquals(0, rectangle.getArea());
  }

  @Test
  public void areaTest() {
    Rectangle rectangle = new Rectangle(5, 6);
    Assertions.assertEquals(30, rectangle.getArea());
  }
}
