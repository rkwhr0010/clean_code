package chap13.ex02;

import java.util.Iterator;

public class IntegerIterator implements Iterator<Integer>{
	private Integer nextValue = 0;

	@Override
	public synchronized boolean hasNext() {
		return nextValue < 100_000;
	}

	@Override
	public synchronized Integer next()  {
		if (nextValue >= 100_000) {
			return -1;
		}
		return nextValue++;
	}
	
	public synchronized Integer getNextValue() {
		return nextValue;
	}
}
