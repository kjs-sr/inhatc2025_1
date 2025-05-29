package week13;

public class CalcEx {
	public static void main(String[] args) {
		//공유 객체 생성
		Calculator calc = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalc(calc);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalc(calc);
		user2.start();
	}
}
