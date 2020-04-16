package edu.wpi.teamname;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleMethodsTest {

  @Test
  public void testRadiusZero() {
    Circle c = new Circle(0);
    Assertions.assertEquals(0, c.getPerimeter());
  }

  @Test
  public void testRadiusIsNegative() {
    Circle c = new Circle(-5);
    Assertions.assertEquals(0, c.getPerimeter());
  }

  @Test
  public void testGetPerimeterNormalCase() {
    Circle c = new Circle(5);
    Assertions.assertEquals(31.4159265359, c.getPerimeter(), 0.0001);
  }

  @Test
  public void testGetAreaZeroRadius() {
    Circle c = new Circle(0);
    Assertions.assertEquals(0, c.getArea());
  }

  @Test
  public void testGetAreaNegativeRadius() {
    Circle c = new Circle(-5);
    Assertions.assertEquals(0, c.getArea());
  }

  @Test
  public void testGetAreaNormalCase() {
    Circle c = new Circle(5);
    Assertions.assertEquals(78.5398163397, c.getArea(), 0.0000001);
  }
}
