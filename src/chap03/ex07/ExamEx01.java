package chap03.ex07;

import java.util.logging.Logger;

public class ExamEx01 {
  private static final String E_OK = null;
  private static final String E_ERROR = null;
  private Logger logger;


  void delete(Page page) {
    try {
      deletePageAndAllReferences(page);
    } catch (Exception e) {
      logError(e);
    }
  }

  private void logError(Exception e) {
    logger.info(e.getMessage());
  }

  private void deletePageAndAllReferences(Page page) throws Exception {
    deletePage(page);
    registry.deleteReference(page.name);
    configKeys.deleteKey(page.name.makeKey());
  }

  private String deletePage(Page page) throws Exception {
    return "";
  }

}