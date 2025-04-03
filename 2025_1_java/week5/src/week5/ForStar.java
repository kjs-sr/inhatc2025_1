package week5;

public class ForStar {
	public static void main(String[] args) {
		//1~10 사이의 랜덤 숫자 생성
		int num = (int)(Math.random() * 10 + 1);
		System.out.println("랜덤 숫자 : " + num);
		for(int i=0; i<num; i++) {
			System.out.print("★");
		}
	}
}
