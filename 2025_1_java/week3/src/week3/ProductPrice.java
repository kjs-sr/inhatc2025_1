package week3;

public class ProductPrice {

	public static void main(String[] args) {
		int price1 = 4500; //상품1 가격
		int price2 = 1000; //상품2 가격
		int price3 = 1500; //상품3 가격
		int count1 = 1; //상품1 개수
		int count2 = 3; //상품2 개수
		int count3 = 2; //상품3 개수
		int totalPrice = 0; //가격 합계
		
		totalPrice += (price1 * count1);
		totalPrice += (price2 * count2);
		totalPrice += (price3 * count3);
		System.out.println("할인 전 가격 : "+totalPrice+"원");
		
		double discount = totalPrice * 0.1;
		System.out.println("할인 금액 : "+discount+"원");
		
		System.out.println("최종 결제 금액 : "+(totalPrice - discount)+"원");
	}

}
