package chap14.ex01;

public class Main {
	public static void main(String[] args) {
		try {
			Args arg = new Args("l,p#,d*", args);
			boolean logging = arg.getBoolean('l'); // 불린
			int port = arg.getInt('p'); // 정수
			String directory = arg.getString('d'); // 문자열
			executeApplication(logging, port, directory);
		} catch (ArgsException e) {
			System.out.printf("Argument error: %s\n", e.errorMessage());
		}
	}

	private static void executeApplication(boolean logging, int port, String directory) {
		/* 예제 없음....*/
	}
}
