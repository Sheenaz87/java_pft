package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test

  public void testDistance () {
    Point p1 = new Point (1,3);
    Point p2 = new Point (5,6);
    Assert.assertEquals( p1.distance (p2),5.0);

  }

@Test
  public void testDistance1 () {
    Point p1 = new Point (0,0);
    Point p2 = new Point (0,0);
    Assert.assertEquals( p1.distance (p2),0.0);

  }

  @Test
  public void testDistance2 () {
    Point p1 = new Point (0,3);
    Point p2 = new Point (-3,-4);
    Assert.assertEquals( p1.distance (p2),7.615773105863909);

  }

}
