package week4;

public class RandomDice {
	public static void main(String[] args) {
		//주사위 놀이 (1~6)
		//랜덤 함수 : Math.random() : 0.0 ~0.99999 의 실수값 변환
		double num = Math.random();
		System.out.println("랜덤 숫자 = " + num);
		
		// 1~6 사이의 숫자를 랜덤하게 얻기 위해 6을 곱한다
		//0.0 ~ 5.999 + 1 => 1.0 ~ 6.999 => 정수만 가져온다
		int number = (int)(num * 6 + 1);
		System.out.println("주사위 값 : "+number);
		
	}
}
