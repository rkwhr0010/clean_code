package chap07.ex04;

public class ExpenseReportDAO {
  
  public MealExpenses getMeals(String id) {
    //청구한 식비가 없다면, 기본형 클래스를 반환한다. 
    //이런 방식을 특수 사례 패턴 이라한다.
    MealExpenses meal = find(id);
    if(meal == null) {
      return new PerDiemMealExpenses();
    }
    return meal;
  }

  private MealExpenses find(String id) {
    return null;
  }
}
