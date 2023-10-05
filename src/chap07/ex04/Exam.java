package chap07.ex04;

public class Exam {
  ExpenseReportDAO expenseReportDAO = new ExpenseReportDAO();
  Employee employee = new Employee();
  int m_total;
  
  void exam() {
    MealExpenses expenses = expenseReportDAO.getMeals(employee.getID());
    m_total += expenses.getTotal();
    
  }

  private int getMealPerDiem() {
    return 0;
  }
}
