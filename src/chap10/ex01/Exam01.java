package chap10.ex01;

public class Exam01 {
	public static String EXAMPLE = "공개상수";
	public String exam = "공개변수";
	protected String exam2 = "보호변수";
	private String exam3 = "비공개변수";
	
	public static void mtd() {}
	public void mtd2() {}
	public void mtd3() {
		mtd3Inner();
	}
	private void mtd3Inner() {}
	protected void mtd4() {}
}
