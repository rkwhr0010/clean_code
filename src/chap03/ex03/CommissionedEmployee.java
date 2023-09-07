package chap03.ex03;

public class CommissionedEmployee extends Employee{

  CommissionedEmployee(EmployeeRecord r) {
    super(r);
  }
  @Override
  public boolean isPayDay() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isPayDay'");
  }
  @Override
  public Money calculatePay() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calculatePay'");
  }
  @Override
  public void deliverPay(Money pay) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deliverPay'");
  }
}
