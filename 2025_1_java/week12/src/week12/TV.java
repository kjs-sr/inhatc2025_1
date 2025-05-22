package week12;

public class TV implements RemoteControl {
	//구현 클래스 : 인터페이스를 사용하는(구현하는) 클래스
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		//유효성 검사
		if(volume > MAX_VALUE)
			volume = MAX_VALUE;
		else if(volume < MIN_VALUE)
			volume = MIN_VALUE;
		
		this.volume = volume;
		System.out.println("현재 TV 볼륨 : "+volume);
	}
}
