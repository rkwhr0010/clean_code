package chap07.ex05;

public class Exam01 {
  PeristenStore peristenStore = new PeristenStore();

  //수 많은 null을 체크하는 더러운 코드
  void registerItem(Item item) {
    if(item != null) {
      ItemRegistry registry = peristenStore.getItemRegistry(); 
      if(registry != null) {
        Item existing = registry.getItem(item.getID());
        if(existing.getBillingPeriod().hasRetailOwner()) {
          existing.register(item);
        }
      }
    }
  }
}
