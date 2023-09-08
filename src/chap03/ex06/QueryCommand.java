package chap03.ex06;

public class QueryCommand {
  
  public boolean set(String attrbute, String value) {
    //저장에 성공하면 true를 실패하면 false를 반환한다고 가정
    return false;
  }

  public void doSomething() {
    /* 이상한 코드 형식 */
    if(set("하나", "둘")) {
    }
  }
}
