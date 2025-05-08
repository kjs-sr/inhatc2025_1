package week10;

class AirLine {
	public void land() {
		System.out.println("착륙");
	}
	public void fly() {
		System.out.println("일반 비행");
	}
	public void takeoff() {
		System.out.println("이륙");
	}
}

public class AirCraft extends AirLine{
	@Override
	public void fly() {
		System.out.println("여객기 비행");
	}
	
	public static void main(String[] args) {
		AirCraft ac = new AirCraft();
		ac.takeoff();
		ac.fly();
		ac.land();
	}
}
