package chap06.ex02;
//다형적인 도형
public class Exam02 {

  interface Shape {
    double area();
  }

  public class Point {
    public double x;
    public double y;
  }

  class Square implements Shape {
    private Point topLeft;
    private double side;

    public double area() {
      return side * side;
    }
  }
  
  class Rectangle implements Shape {
    private Point topLeft;
    private double height;
    private double width;

    public double area() {
      return height * width;
    }
  }

  class Circle implements Shape {
    private Point center;
    private double radius;
    public final double PI = 3.14159265358979323846;

    public double area() {
      return PI * radius * radius;
    }
  }
}