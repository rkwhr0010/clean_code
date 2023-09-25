package chap06.ex01;

/*
 * 단순히 변수를 private으로 바꾸고
 * 그 사이 메서드를 넣는다고,구현이 감춰지지 않는다.
 * 구현을 감추려면 추상화가 필요하다.
 */
public class Point3 {
  //구현을 그대로 노출하는 것이랑 다를바 없다.
  private double x;
  private double y;

  public double getX() {
    return x;
  }
  public void setX(double x) {
    this.x = x;
  }
  public double getY() {
    return y;
  }
  public void setY(double y) {
    this.y = y;
  }
}
