package week2;

public class PersonInfo {
	public static void main(String[] args) {
		//변수 선언
		String name = "홍길동";
		int age = 25;
		double height = 175.5;
		char gender = 'M';
		Boolean chkStudent = true;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height + "cm");
		//System.out.printf("키: %.1fcm\n",height);
		System.out.println("성별: " + gender);
		System.out.println("학생 여부: " + chkStudent);
	}
}
