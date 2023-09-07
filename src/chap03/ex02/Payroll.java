package chap03.ex02;

import java.util.Date;

public class Payroll {
  public Money calculatePay(Employee e) throws InvalidEmployeeType{
    switch (e.type) {
      case COMMISSIONED:
        return calculateCommissionedPay(e);
      case HOURLY:
        return calculateHourlyPay(e);
      case SALARIED:
        return calculateSalariedPay(e);
      default:
        throw new InvalidEmployeeType(e.type);
    }
  }

  private Money calculateSalariedPay(Employee e) {
    return null;
  }

  private Money calculateHourlyPay(Employee e) {
    return null;
  }

  private Money calculateCommissionedPay(Employee e) {
    return null;
  }

  /*
  * 페이지 48, 가장 큰 문제 예시
  * 똑같은 유해한 구조가 무한정 반복될 수 있다.
  */
  void isPayDay(Employee e, Date date) throws InvalidEmployeeType {
    switch (e.type) {
      case COMMISSIONED:
        /* 뭔가 하는 코드 */
        return ;
      case HOURLY:
        /* 뭔가 하는 코드 */
        return ;
      case SALARIED:
        /* 뭔가 하는 코드 */
        return ;
      default:
        throw new InvalidEmployeeType(e.type);
    }
  }
  void deliverPay(Employee e, Money money) throws InvalidEmployeeType{
    switch (e.type) {
      case COMMISSIONED:
        /* 뭔가 하는 코드 */
        return ;
      case HOURLY:
        /* 뭔가 하는 코드 */
        return ;
      case SALARIED:
        /* 뭔가 하는 코드 */
        return ;
      default:
        throw new InvalidEmployeeType(e.type);
    }
  }
}


/*
 * 테스트 용 더미 클래스
 */
class Money {

}
class Employee{
  SalraryType type;
}
enum SalraryType {
  COMMISSIONED, HOURLY, SALARIED
}
class InvalidEmployeeType extends Exception{
  InvalidEmployeeType(){}
  InvalidEmployeeType(SalraryType type){}
}