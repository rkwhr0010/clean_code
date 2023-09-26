package chap06.ex03;

import java.io.BufferedOutputStream;

public class Exam03 {
  Context ctxt = new Context();
  void exam1() {
    //공개해야하는 메서드가 너무 많다.
    ctxt.getAbsolutePathOfScratchDirectoryOption();

    //getScratchDirectoryOption() 반환하는 값이 자료 구조라고 가정하게 된다.(노출했으니까)
    ctxt.getScratchDirectoryOption().getAbsolutePath();
  }

  void exam2() {
    String classFileName = "";
    //코드를 분석해서 메서드 이름을 명시적으로 지었다.
    //그리고 무언가를 생성하라고 명령했다. (내부 구조 드러냄 없음, 디미터 법칙 준수)
    BufferedOutputStream bos = ctxt.createScratchFileStream(classFileName);
  }
}
