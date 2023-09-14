package chap05.ex01;

import java.util.ArrayList;
import java.util.List;

public class ReporterConfig {
  /**
   * 리포터 리스너 클래스 이름
   */
  private String m_className;

  /**
   * 리포터 리스너 속성
   */
  private List<Property> m_properties = new ArrayList<>();
  public void addProperty(Property property) {
    m_properties.add(property);
  }
}
