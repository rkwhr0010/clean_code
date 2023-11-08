package chap13.ex02;

public class IntegerIteratorServerLocked {
	private Integer nextValue = 0;
	
	public synchronized Integer getNextOrNull() {
		if (nextValue < 100_000) {
			return nextValue++;
		} else {
			return null;
		}
	}
}
