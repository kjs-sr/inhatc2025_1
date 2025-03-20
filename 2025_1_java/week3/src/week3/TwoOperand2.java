package week3;

public class TwoOperand2 {

	public static void main(String[] args) {
		// 이항 연산자 : 비교연산자(<, >, <=, >=, ==, !=)
		// 논리 연산자 : &&(and, &), ||(or, |)
		int charCode1 = 'A';
		if(charCode1 >= 65 && charCode1 <= 90) {
			//true && ture = true => 둘 다 true이면 최종 ture(&&)
			//65와 90 사이인 경우
			System.out.println((char)charCode1 + "는 알파벳 대문자이다.");
		}
		int charCode2 = 'b';
		if(charCode2 >= 97 && charCode2 <= 122) {
			//97와 122 사이인 경우
			System.out.println((char)charCode2 + "는 알파벳 소문자이다.");
		}
		
		char charCode3 = '9';
		if(!(charCode3 < 48) && !(charCode3 > 57)) {
			System.out.println(charCode3 + "는 0~9 사이의 숫자이다.");
		}
		
		int iValue = 4;
		//% : 나머지
		if(iValue % 2 == 0) {
			System.out.println(iValue + "는 2의 배수 또는 짝수이다.");
		}
		
		//2의 배수 이거나(or, ||) 3의 배수인지 체크
		if(iValue%2==0 || iValue%3==0) {
			//true || false => 둘 중 하나라도 참이면 true
			System.out.println(iValue + "는 2의 배수이거나 3의 배수이다.");
		}
	}

}
