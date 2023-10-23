package chap11.ex01;

public class Exam02 {
	void exam() {
    // JNDI 검색은 의존성 주입을 부분적으로 구현한 기능
    // 디렉터리 서버에 이름을 제공하고 그 이름에 일치하는 서비스를 요청
		Service myService = (Service)JndiContext.lookup("이름");
	}
}
