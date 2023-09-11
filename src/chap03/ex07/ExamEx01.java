package chap03.ex07;

import java.util.logging.Logger;

public class ExamEx01 {
  private static final String E_OK = null;
  private static final String E_ERROR = null;
  private Logger logger;


  String something(Page page) {
    if(deletePage(page) == E_OK) {
      if(registry.deleteReference(page.name) == E_OK) {
        if(configKeys.deleteKey(page.name.makeKey() == E_OK)){
          logger.info("page deleted");
        } else {
          logger.info("configKey not deleted");
        }
      } else {
        logger.info("deleteReference from registry failed");
      } 
    } else {
      logger.info("delete failed");
      return E_ERROR;
    }
    
    return E_OK; 
  }

  private String deletePage(Page page) {
    return "";
  }

}