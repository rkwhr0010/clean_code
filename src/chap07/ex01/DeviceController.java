package chap07.ex01;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class DeviceController {
  private static final String DEV1 = null;
  private static final boolean DEVICE_SUSPENDED = false;
  private Recode recode;
  private Logger logger;

  public void sendShutDown() {
    try {
      tryToShutdown();
    } catch (DeviceShutDownError e) {
      logger.log(Level.INFO, e);
    }
  }

  private void tryToShutdown() throws DeviceShutDownError {
    DeviceHandle handle = getHandle(DEV1);
      retrieveDeviceRecord(handle);
      pauseDevice(handle);
      clearDeviceWorkQueue(handle);
      pauseDevice(handle);
  }

  private void clearDeviceWorkQueue(DeviceHandle handle) {
  }

  private void pauseDevice(DeviceHandle handle) {
  }

  private void retrieveDeviceRecord(DeviceHandle handle) {
  }

  private DeviceHandle getHandle(String dev12) {
    return null;
  }
}
