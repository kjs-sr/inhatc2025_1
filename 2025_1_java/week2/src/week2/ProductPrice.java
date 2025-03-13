package week2;

public class ProductPrice {
	public static void main(String[] args) {
		int count = 7;
		int price = 5700;
		
		// int/int => int
		double productPrice = (double)price / count;
		System.out.println("구매 수량 : "+count+"개");
		System.out.println("총 구매 금액 : "+price+"원");
		System.out.printf("상품 단가 : %.1f원\n",productPrice);
	}
}
