package week12;

public class RemoteControlEx {
	public static void main(String[] args) {
		//구현 클래스를 이용해서 구현 객체를 생성
		Audio audio = new Audio();
		TV tv = new TV();
		
		//생성된 구현객체로 메소드 호출
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();
		
		System.out.println("---");
		
		tv.turnOn();
		tv.setVolume(3);
		tv.setMute(true);
		tv.turnOff();
		
		System.out.println("---");
		RemoteControl.changeBattery();
		
		System.out.println("---");
		
		SmartTV smart = new SmartTV();
		smart.turnOn();
		smart.setVolume(3);
		smart.setMute(true);
		smart.search("네이버");
		smart.setMute(false);
		smart.turnOff();
		
		//상수 필드 접근
		System.out.println("리모컨 최대 볼륨 : "+RemoteControl.MAX_VALUE);
		System.out.println("리모컨 최소 볼륨 : "+RemoteControl.MIN_VALUE);
		
		System.out.println("-- 인터페이스의 다형성 --");
		
		RemoteControl[] rc = new RemoteControl[3];
		rc[0] = audio;
		rc[1] = tv;
		rc[2] = smart;
		
		for(RemoteControl r : rc) {
			r.turnOn();
			r.setVolume(5);
			r.setMute(true);
			r.setMute(false);
			r.turnOff();
		}
	}
}