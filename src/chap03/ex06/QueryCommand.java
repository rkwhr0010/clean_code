package chap03.ex06;

public class QueryCommand {
  //명령
  public void set(String attribute, String value) {
  }
  //질의
  public boolean attributeExists(String string) {
    return false;
  }
  public void doSomething() {
    if(attributeExists("하나")) {
      set("하나", "둘");
    }
  }
}
