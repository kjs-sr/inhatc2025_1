package week7;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	String phone;
	
	//객체 생성 시 매개변수로 초기화
	//생성자 정의
	Korean(String name, String ssn, String phone){
		//각 필드를 초기화
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}
}
