package chap13.ex02;

public class Main {
	public static void main(String[] args) throws Exception {
		serverBaseThreadSafe();
	}
	
	
	private static void serverBaseThreadSafe() {
		IntegerIteratorServerLocked it = new IntegerIteratorServerLocked();
		while (true) {
			Integer nextValue = it.getNextOrNull();
			if (nextValue == null) {
				break;
			}
			// nextValue 로 무언가를 계산
		}
	}


	private static void notThreadSafe() {
		IntegerIterator it = new IntegerIterator();
		while (it.hasNext()) {
			int nextValue = it.next();
			// nextValue 로 무언가를 계산
		}
	}
	static void clientBaseThreadSafe() {
		IntegerIterator it = new IntegerIterator();
		while (true) {
			int nextValue;
			synchronized (it) {
				if (!it.hasNext()) {
					break;
				}
				nextValue = it.next();
			}
			doSomethingWith(nextValue);
		}
	}
	
	private static void doSomethingWith(int nextValue) {
		
	}
}
