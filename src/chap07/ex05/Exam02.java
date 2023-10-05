package chap07.ex05;

import java.util.List;

public class Exam02 {
  void exam() {
    int totalPay = 0;
    List<Employee> employees = getEmployees();
    if(employees != null) {
      for(Employee e : employees) {
        totalPay += e.getPay();
      }
    }
  }

  private List<Employee> getEmployees() {
    return null;
  }
}
