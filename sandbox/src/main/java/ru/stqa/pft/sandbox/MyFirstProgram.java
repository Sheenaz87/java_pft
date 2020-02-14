package ru.stqa.pft.sandbox;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

public class MyFirstProgram {

    public static void main(String[] args) {

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point (1,4);
    Point p2 = new Point (2,6);
    System.out.println("Расстояние между двумя точками  = " + distance(p1,p2));

    }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p1.y - p1.x) * (p1.y - p1.x) + (p2.y - p2.x) * (p2.y - p2.x));

  }







}