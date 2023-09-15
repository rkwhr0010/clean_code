package chap05.ex02;

import java.util.List;

public class Exam {
  List<Object> lists;

  int count() {
    int count = 0;
    //가까운 변수 좋은 예
    for (final Object obj : lists) {
      count++;
    }

    return count;
  }

  void something() {
    for (final Object obj : lists) {
      //좋은 예
      final Object someThing = createInstance();

    }
  }

  private Object createInstance() {
    return null;
  }
}
