package chap04.ex03;

import chap04.ex02.WikiPagePath;

public class Exam {
  
  void testCompareTo() throws Exception {
    WikiPagePath a = PathParser.parse("PageA");
    WikiPagePath ab = PathParser.parse("PageA.PageB");
    WikiPagePath b = PathParser.parse("PageB");
    WikiPagePath aa = PathParser.parse("PageA.PageA");
    WikiPagePath bb = PathParser.parse("PageB.PageB");
    WikiPagePath ba = PathParser.parse("PageB.PageA");

    //assertTrue 가 라이브러리를 사용한 것이라고 가정
    assertTrue(a.compareTo(a) == 0); // a == a
    assertTrue(a.compareTo(b) != 0); // a != b
    assertTrue(a.compareTo(b) == -1);// a < b
  }

  private void assertTrue(boolean b) {
  }
}
