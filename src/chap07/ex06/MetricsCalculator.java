package chap07.ex06;

//개선 시도2
public class MetricsCalculator {
  public double xProjection(Point p1, Point p2)  {
    assert p1 != null : "p1는 null이면 안됩니다.";
    assert p2 != null : "p2는 null이면 안됩니다.";
    return (p2.x - p1.x) * 1.5;
  }
}
