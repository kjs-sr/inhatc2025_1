package week7;

public class StudentEx {
	public static void main(String[] args) {
		//실행할 목적으로 만드는 실행 클래스
		//라이브러리용 클래스를 이용해서 객체 생성
		
		//st1은 클래스 Student의 인스턴스
		Student st1 = new Student();
		System.out.println("st1 변수가 Student 객체를 참조한다.");

		Student st2 = new Student();
		System.out.println("st2 변수가 Student 객체를 참조한다.");
	}
}
