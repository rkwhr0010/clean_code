package chap11.ex01;

public class Exam01 {
	Service service;
	
  //지연로딩 예시
	public Service getService() {
		if(service == null) {
			service = new ServiceImpl("1", "2", "3"); // 모든 상황에 적합한 객체인지 모르겠음...
		}
		return service;
	}
}
