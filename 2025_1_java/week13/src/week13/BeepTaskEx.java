package week13;

public class BeepTaskEx {
	public static void main(String[] args) throws InterruptedException {
		// Thread 객체를 직접 생성
		// 매개변수로 인터페이스 구현 객체를 사용
		// 구현 객체 생성
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
