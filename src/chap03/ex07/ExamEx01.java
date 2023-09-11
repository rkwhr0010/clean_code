package chap03.ex07;

import java.util.logging.Logger;

public class ExamEx01 {
  private static final String E_OK = null;
  private static final String E_ERROR = null;
  private Logger logger;


  void something(Page page) {
    try {
      deletePage(page);
      registry.deleteReference(page.name);
      configKeys.deleteKey(page.name.makeKey());
    } catch (Exception e) {
      logger.info(e.getMessage());
    }
  }

  private String deletePage(Page page) throws Exception {
    return "";
  }

}