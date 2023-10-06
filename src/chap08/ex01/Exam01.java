package chap08.ex01;

import java.util.HashMap;
import java.util.Map;

public class Exam01 {
  void exam() {
    String sensorsId = "key";
    //지네릭스 없던 시절 예시

    Map sensors = new HashMap();
    Sensor s = (Sensor) sensors.get(sensorsId);
  }
}
