package chap05.ex03;

public class Exam {
  private int lineCount;
  private int totalChars;
  private LineWidthHistogram lineWidthHistogram;

  private void measureLine(String line) {
    lineCount++;
    int lineSize = line.length();
    totalChars += lineSize;
    lineWidthHistogram.addLine(lineSize, lineCount);
    recordWidestLine(lineSize);
  }

  private void recordWidestLine(int lineSize) {
  }
}
