package chap07.ex06;

//두 지점 사이 거리 계산
public class MetricsCalculator {
  public double xProjection(Point p1, Point p2) {
    return (p2.x - p1.x) * 1.5;
  }
}
