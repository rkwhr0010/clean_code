package chap08.ex01;

import java.util.HashMap;
import java.util.Map;
//맵 레퍼 클래스
public class Sensors {
  private final Map sensors = new HashMap();

  public Sensor getById(String id) {
    return (Sensor) sensors.get(id);
  }
  //불필요한 기능을 제거할 수 있다. 이 경우는 인터페이스가 없다...
  //프록시로 구현해(대신 인터페이스 구현 필요)
  //불필요한 기능을 예외를 던지도록 구현할 수 있다.
}
