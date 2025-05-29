package week13;

public class RamenCooker extends Thread{
	String name;
	
	public RamenCooker(String name) {
		this.name = name;
	}
	
	//작업 스레드에서 처리할 내용을 코딩
	@Override
	public void run() {
		
		try {
			System.out.println("🍲" + name + ": 물을 끓이는 중...");
			Thread.sleep(2000);
			
			System.out.println("🍜" + name + ": 면을 넣는 중...");
			Thread.sleep(2000);
			
			System.out.println("🥡" + name + ": 라면 완성!");
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
	}
}
