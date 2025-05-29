package week13;

public class User1 extends Thread{
	private Calculator calc;

	public void setCalc(Calculator calc) {
		setName("User1");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		try {
			calc.setMemory(100);
		} catch (InterruptedException e) {}
	}
}
