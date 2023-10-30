package chap13.ex01;

public class Main {
	public static void main(String[] args) {
		X x = new X();
		
		for (int i = 0; i < 100_000; i++) {
			createThread(() -> System.out.println(x.getNextId()));
		}
	}
	
	static void createThread(Runnable run) {
		new Thread(run).start();
	}
	
}
