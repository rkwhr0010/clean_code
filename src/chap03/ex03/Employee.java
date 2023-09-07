package chap03.ex03;

public abstract class Employee {
  EmployeeRecord r;

  Employee(EmployeeRecord r) {
    this.r = r;
  }
  public abstract boolean isPayDay() ;
  public abstract Money calculatePay() ;
  public abstract void deliverPay(Money pay) ;
}
