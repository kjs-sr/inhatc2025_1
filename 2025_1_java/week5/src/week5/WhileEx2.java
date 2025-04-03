package week5;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		//무한 루프 처리
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		while(true) {
			//무한 반복 부분
			System.out.println("첫 번째 숫자 >> ");
			num1 = sc.nextInt();
			
			System.out.println("두 번째 숫자 >> ");
			num2 = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		}
	}
}
