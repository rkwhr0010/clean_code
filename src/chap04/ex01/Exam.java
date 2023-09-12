package chap04.ex01;

public class Exam {
  Employee employee;
  private final boolean HOURLY_FLAG = true;

  //어느것이 더 좋은지 비교
  void example() {
    //직원에게 복지 혜택을 받을 자격이 있는지 검사
    if((employee.flags & HOURLY_FLAG) && employee.age > 65) {
      /* ~~~~ */
    }

    if(employee.isEligibleForFullBenefits()) {
      /* ~~~~ */
    }
  }
}
