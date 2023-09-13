package chap04.ex04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam {
  private int level;

  Object example() {
    Pattern compile = Pattern.compile("");
    Matcher match = compile.matcher("");
    String text = "";

    //trim() 중요하다. 시작에 공백이 들어가 있으면, 다른 문자열로 인식된다.
    String listItemContent = match.group(3).trim();
    new ListItemWidget(this, listItemContent, this.level + 1);
    return buildList(text.substring(match.end()));

  }

  private Object buildList(String substring) {
    return null;
  }
}
