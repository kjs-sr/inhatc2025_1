package week5;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단?");
		int num = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d",num, i, num*i);
			System.out.println();
		}
		sc.close();
	}
}
