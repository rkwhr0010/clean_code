package chap07.ex01;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class DeviceController {
  private static final String DEV1 = null;
  private static final boolean DEVICE_SUSPENDED = false;
  private Recode recode;
  private Logger logger;

  public void sendShutDown() {
    DeviceHandle handle = getHandle(DEV1);
    //디바이스 생태 점검
    if (handle != DeviceHandle.INVALID) {
      //레코드 필드에 디바이스 상태 저장
      retrieveDeviceRecord(handle);
      //디바이스가 일시정지 상태가 아니라면 종료
      if (recode.getStatus() != DEVICE_SUSPENDED) {
        pauseDevice(handle);
        clearDeviceWorkQueue(handle);
        pauseDevice(handle);
      } else {
        logger.log(Level.INFO, "Device suspended. Unable to shutdown");
      }
    } else {
      logger.log(Level.INFO, "Invalid handle for: " + DEV1.toString());
    }
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
