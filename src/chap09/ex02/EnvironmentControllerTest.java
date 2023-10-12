package chap09.ex02;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class EnvironmentControllerTest {
	private static final double WAY_TOO_COLD = 0.0;
	Hardware hw;
	Controller controller;
	
	@Test
	public void turnOnLoTempAlarmAtThreashold() throws Exception {
		hw.setTemp(WAY_TOO_COLD);
		controller.tic();
		assertTrue(hw.heaterState());
		assertTrue(hw.blowerState());
		assertFalse(hw.coolerState());
		assertFalse(hw.hiTempAlarm());
		assertTrue(hw.loTempAlarm());
	}
}
