package chap07.ex04;

public class Exam {
  ExpenseReportDAO expenseReportDAO = new ExpenseReportDAO();
  Employee employee = new Employee();
  int m_total;
  
  void exam() {
    try {
      //청구한 식비가 있으면 총계에 더한다.
      MealExpenses expenses = expenseReportDAO.getMeals(employee.getID());
      m_total += expenses.getTotal();
    } catch (MealExpensesNotFound e) {
      //청구한 게 없다면, 기본형 요금을 더한다.
      m_total += getMealPerDiem();
    } 
  }

  private int getMealPerDiem() {
    return 0;
  }
}
