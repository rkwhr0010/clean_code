package chap03.ex04;

public class ParamMeterObject {
  //이것 보다.
  Circle makeCircle(double x, double y, double radius){
    return new Circle(x, y, radius);
  }
  //이것이 더 명료하다. 연관있는 인수를 하나로 묶었기 때문이다.
  Circle makeCircle(Point center, double radius){
    return new Circle(center, radius);
  }
}
