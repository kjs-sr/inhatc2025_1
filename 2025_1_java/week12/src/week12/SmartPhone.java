package week12;

public class SmartPhone {
	//필요한 속성 => 인터페이스 변수
	EarPhone earphone;
	
	//이어폰의 종류를 매개변수로 받음
	public void musicOn(EarPhone ep) {
		ep.play();
	}
	
	public void musicOff(EarPhone ep) {
		ep.stop();
	}
}
