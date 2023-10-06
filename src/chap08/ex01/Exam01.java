package chap08.ex01;

import java.util.HashMap;
import java.util.Map;

public class Exam01 {
  void exam() {
    String sensorsId = "key";

    Map<String, Sensor> sensors = new HashMap<>();
    Sensor s = sensors.get(sensorsId);
  }
}
