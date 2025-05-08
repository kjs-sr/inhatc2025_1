package week10;

public class CarEx {
	public static void main(String[] args) {
		Car mycar = new Car();
		//private는 외부에서 접근 불가
		//mycar.company = "현대자동차";
		
		//setter() 이용
		mycar.setCompany("현대자동차");
		mycar.setModel("그랜저");
		mycar.setColor("white");
		
		//getter() 이용
		System.out.println(mycar.getCompany());
		System.out.println(mycar.getModel());
		System.out.println(mycar.getColor());
	}
}
