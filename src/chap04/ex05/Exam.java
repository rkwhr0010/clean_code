package chap04.ex05;

import java.util.logging.Logger;

public class Exam {
  

  private boolean closed;
  /*
   * this.closed 가 true 일 때 반환되는 메서드
   * 타임아웃에 도달하면 예외를 던진다.
   */
  synchronized void waitForClose(final long timeoutMillis) throws Exception {
    if(!closed) {
      wait(timeoutMillis);
      if(!closed) {
        throw new Exception("MockResponseSender Could not be closed");
      }
    }
  }

  /* 로그를 찍기 위한 로거 */
  Logger logger;

}
