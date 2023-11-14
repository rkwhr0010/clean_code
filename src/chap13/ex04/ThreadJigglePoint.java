package chap13.ex04;

public class ThreadJigglePoint {
	private static Action action;
	
	static {
		//환경에 따라 다르게 사용하도록 구현
		if(isLocal()) {
			action = Action.Op;
		} else {
			action = Action.NoOp;
		}
	}

	private static boolean isLocal() {
		return true;
	}
	
	public static void jiggle() {
		action.jiggle();
	}
	
	
	enum Action {
		Op {
			void jiggle() {
				//무작위로 sleep() yield() 등과 같은 쓰레드 제어 메서드를 랜덤으로 호출한다.
			}
		}, 
		NoOp {
			void jiggle() {
				//아무것도 하지 않는다.
			}
		};
		
		abstract void jiggle();
	}
}
