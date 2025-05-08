package week10;

public class SmartPhone extends Phone{
	//부모 크래스 Phone을 상속받음
	//추가사항 선언
	private boolean wifi;
	
	public SmartPhone(String model, String color) {
//		this.model = model;
//		this.color = color;
		//부모 클래스 생성자를 호출
		super(model, color);
		
		System.out.println("SmartPhone() 생성자 호출");
	}
	
	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("wifi 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷 연결");
	}
}
