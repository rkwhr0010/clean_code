package chap03.ex03;

public interface EmployeeFactory {
  Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}
