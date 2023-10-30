package chap13.ex01;

public class X {
	private int lastIdUsed;
	
	public void resetLastIdUsed() {
		lastIdUsed = 0;
	}

	public int getNextId() {
		return ++lastIdUsed; // lastIdUsed = lastIdUsed + 1
	}
}
