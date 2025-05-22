package week12;

public interface RemoteControl {
	//인터페이스 선언
	//인터페이스의 필드 => 상수필드 = 반드시 초기화
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	//모든 자식 객체에서 사용하는 기능을 모아 놓은 것
	//데이터를 저장하는 필드 선언은 불가능
	//선언된 필드 => 상수필드(public static final)
	//선언된 메소드 => abstaract가 생략되어도 자동으로 추상메소드가 됨
	//추상 메소드 = 실행문이 없는 메소드
	//추상 메소드 => 구현 클래스에서 반드시 재정의해서 사용
	public void turnOn();
	
	//기능 추가
	void turnOff();
	void setVolume(int volume);
	
	//새로운 기능 추가
	//default 메소드로 선언 => 기존 구현 클래스에는 영향을 주지 않는다.
	default void setMute(boolean mute) {
		//default 메소드는 반드시 실행 명령문이 포함되어야 함.
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(0);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드 추가
	//구현 객체가 없어도 인터페이스 이름으로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("리모컨 건전지 교환");
	}
}
