package chap13.ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	static IntegerIterator it = new IntegerIterator();
	static List<Integer> intArr = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		
		
		for (int i = 0; i < 50; i++) {
			new Thread(() -> notThreadSafe()).start();
		}
		Thread.currentThread().sleep(2000);
		System.out.println();
		
		intArr.sort(Integer::compare);
		intArr.forEach(System.out::println);
		
		
		ArrayList<Integer> newArr = new ArrayList<>();

		for (int i = 1; i < intArr.size(); i++) {
			final Integer cur = intArr.get(i);
			final Integer prev = intArr.get(i - 1);
			
			if (prev + 1 != cur) {
				Integer gap = cur - prev;
				for (int j = 1; j <= gap; j++) {
					newArr.add(prev + j);
				}
			}
		}
		
		System.out.println(intArr.size());
		System.out.println(newArr.size());
		System.out.println(newArr);
	}
	
	
	private static void notThreadSafe() {
		while (it.hasNext()) {
			int nextValue = it.next();
			intArr.add(nextValue);
			// nextValue 로 무언가를 계산
		}
	}
	static void threadSafe() {
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
