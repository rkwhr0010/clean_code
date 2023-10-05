package chap07.ex06;

public class Exam01 {
  void exam() {
    MetricsCalculator calculator = new MetricsCalculator();

    try {
      calculator.xProjection(null, new Point(12, 13));
    } catch (InvalidArgumentException e) {
      e.printStackTrace();
    }
  }
}
