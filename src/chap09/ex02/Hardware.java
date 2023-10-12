package chap09.ex02;

public class Hardware {

	private boolean heater;
	private boolean bowler;
	private boolean cooler;
	private boolean hiTempAlram;
	private boolean loTempAlram;

	public void setTemp(double wayTooCold) {
		// TODO Auto-generated method stub
		
	}

	public boolean heaterState() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean blowerState() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean coolerState() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hiTempAlarm() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean loTempAlarm() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getState() {
		String state = "";
		state += heater ? "H" : "h";
		state += bowler ? "B" : "b";
		state += cooler ? "C" : "c";
		state += hiTempAlram ? "H" : "h";
		state += loTempAlram ? "L" : "l";
		
		return state;
	}

}
