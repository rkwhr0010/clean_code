package chap07.ex03;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exam01 {
  private final Logger logger = Logger.getLogger(getClass().toString());

  void exam() {
    LocalPort port = new LocalPort(12);
    try {
      port.open();
    } catch (PortDeviceFailure e) {
      reportPortError(e);
      logger.log(Level.INFO, e.getMessage());
    } finally {
      //.............
    }
  }

  private void reportPortError(Exception e) {
  }
}
