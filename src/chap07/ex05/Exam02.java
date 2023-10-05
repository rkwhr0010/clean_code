package chap07.ex05;

import java.util.Collections;
import java.util.List;

public class Exam02 {
  void exam() {
    int totalPay = 0;

    List<Employee> employees = getEmployees();
    //null을 체크할 필요가 없다.
    for(Employee e : employees) {
      totalPay += e.getPay();
    }
  }

  private List<Employee> getEmployees() {
    boolean result = false; //직원이 없다고 가정
    if(result) {
      return Collections.emptyList();
    }
    //정상적으로 반환했다고 가정
    return null;
  }
}
