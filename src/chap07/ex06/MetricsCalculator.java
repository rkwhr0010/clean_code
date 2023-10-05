package chap07.ex06;

//개선 시도
public class MetricsCalculator {
  public double xProjection(Point p1, Point p2) throws InvalidArgumentException {
    if(p1 == null || p1 == null) {
      throw new InvalidArgumentException("MetricsCalculator.xProjection에 비정상 인자");
    }
    return (p2.x - p1.x) * 1.5;
  }
}
