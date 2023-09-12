package chap04.ex02;

import java.util.regex.Pattern;

public class Exam {
  public static void main(String[] args) {
    //kk:mm:ss EEE, MMM dd, yyyy 형식
    Pattern timeMatcher = Pattern.compile(
      "\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*");
  }
}
