import java.util.logging.Level;
import java.util.logging.Logger;

public class Exam01 {
  private final Logger logger = Logger.getLogger(getClass().toString());

  //안좋은 예
  void exam() {
    ACMPort port = new ACMPort(12);

    try {
      port.open();      
    } catch (DeviceResponseException e) {
      reportPortError(e);
      logger.log(Level.INFO, "Device response exception");
    } catch (ATM1212UnlockedException e) {
      reportPortError(e);
      logger.log(Level.INFO, "Device response exception");
    } catch (GMXError e) {
      reportPortError(e);
      logger.log(Level.INFO, "Device response exception");
    } finally {
      //.............
    }
  }

  private void reportPortError(Exception e) {
  }
}
