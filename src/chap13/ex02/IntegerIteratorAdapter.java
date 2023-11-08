package chap13.ex02;

public class IntegerIteratorAdapter {
	private IntegerIterator it = new IntegerIterator();
	
	public synchronized Integer getNextOrNull() {
		if (it.hasNext()) {
			return it.next();
		} else {
			return null;
		}
	}
}
