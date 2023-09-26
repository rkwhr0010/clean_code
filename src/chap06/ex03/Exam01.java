package chap06.ex03;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
  class C {
    List<?> list = new ArrayList<>();
    //디미터의 법칙, 다음과 같은 객체의 메서드만 호출해야 한다.
    List<?> f(List<?> list) {
      list.add(null);//인수로 넘어온 객체
      this.list.add(null);//인스턴스 변수에 저장된 객체
      new ArrayList<>().add(null);//메서드 내에서 생성된 객체
      //허용된 메서드가 반환하는 메서드는 호출하면 안된다.
      return new ArrayList<>(); 
    }
  }
}
