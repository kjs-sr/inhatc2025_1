package week4;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 구매 가격 입력 >> ");
		int price = sc.nextInt();
		int rate = 0;
		if(price >= 100000)
			rate = 10;
		else if(price >= 50000)
			rate = 5;
		int dicountAmt = price*(rate/100);
		System.out.println("원래 가격: "+price);
		System.out.println("할인율: "+rate+"%");
		System.out.println("최종 가격: "+ (price-dicountAmt)+"원");
	}
}
