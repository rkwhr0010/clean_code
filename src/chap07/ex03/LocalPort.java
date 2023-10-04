package chap07.ex03;

public class LocalPort {
  private final ACMPort innerPort;

  public LocalPort(int i) {
    innerPort = new ACMPort(i);
  }

  public void open() {
    try {
      innerPort.open();      
    } catch (
        DeviceResponseException | 
        ATM1212UnlockedException |
        GMXError e) {
      throw new PortDeviceFailure(e);
    } 
  }
}
