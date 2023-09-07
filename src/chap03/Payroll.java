package chap03;

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