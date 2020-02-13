package ru.stqa.pft.sandbox;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

public class MyFirstProgram {

    public static void main(String[] args) {
            hello("world");
        hello("user");

        Point p1 = new Point (4,5);
        Point p2 = new Point (5,6);
      System.out.println("Расстояние между точками " + p1 + " и " + p2 + " = " + distance(p1,p2));


        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");

    }

  public static double distance(Point p1, Point p2) {
      return Math.sqrt(p1.x * p1.y + p2.x * p2.y);

  }











}