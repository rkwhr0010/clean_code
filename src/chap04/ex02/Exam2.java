package chap04.ex02;

import java.util.concurrent.atomic.AtomicBoolean;

public class Exam2 implements Comparable{
  private String[] names;

  @Override
  public int compareTo(Object o) {
    if(o instanceof WikiPagePath) {
      WikiPagePath p = (WikiPagePath) o;
      String compressedName = StringUtil.join(names, "");
      String compressedArgumentName = StringUtil.join(p.names, "");
      return compressedName.compareTo(compressedArgumentName);
    }
    return 1; //오른쪽 유형이므로 정렬 순위가 더 높다.
  }

  void testConcurrentAddWidgets() throws Exception {
    WidgetBuilder widgetBuilder = new WidgetBuilder(new Class[]{BoldWidget.class});
    String text = "'''bold text'''";
    ParentWiget parent = new BoldWidget(new MockWidgetRoot(), "'''bold test'''");
    AtomicBoolean failFalg = new AtomicBoolean();
    failFalg.set(false);
    //스레드를 대량 생성하는 방법으로 어떻게든 경쟁 조건을 만들려 시도한다.
    for (int i = 0; i < 25000; i++) {
      WidgetBuilderThread widgetBuilderThread =
          new WidgetBuilderThread(widgetBuilder, text, parent, failFalg);
      Thread thread = new Thread(widgetBuilderThread);
      thread.start();
    }
    assertEquals(false, failFalg.get());
  }

  private void assertEquals(boolean b, boolean c) {
  }
}
