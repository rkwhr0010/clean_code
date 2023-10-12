package chap09.ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EnvironmentControllerTest {
	private static final double WAY_TOO_COLD = 0.0;
	Hardware hw;
	Controller controller;
	
	@Test
	public void turnOnLoTempAlarmAtThreashold() throws Exception {
		wayTooCold();
		assertEquals("HBchL", hw.getState());
	}

	private void wayTooCold() {
		hw.setTemp(WAY_TOO_COLD);
		controller.tic();
	}
}
