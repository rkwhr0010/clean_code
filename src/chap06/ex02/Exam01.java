package chap06.ex02;

//절차적 도형 예시
public class Exam01 {
  //자료구조
  public class Point {
    public double x;
    public double y;
  }
  //자료구조
  public class Square {
    public Point topLeft;
    public double side;
  }
  //자료구조
  public class Rectangle {
    public Point topLeft;
    public double height;
    public double width;
  }
  //자료구조
  public class Circle {
    public Point center;
    public double radius;
  }
  //동작 방식 정의
  public class Geometry {
    public final double PI = 3.14159265358979323846;

    public double area(Object shape) throws NoSuchShapeException {
      if(shape instanceof Square) {
        Square s = (Square)shape;
        return s.side * s.side;
      } else if (shape instanceof Rectangle) {
        Rectangle s = (Rectangle)shape;
        return s.height * s.width;
      } else if (shape instanceof Circle) {
        Circle s = (Circle)shape;
        return PI * s.radius * s.radius;
      } else {
        throw new NoSuchShapeException();
      }
    }
  }

  class NoSuchShapeException extends RuntimeException {}
}
