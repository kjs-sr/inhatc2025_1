package week13;

public class BeepThread extends Thread{
	//run() 메소드 재정의
	@Override
	public void run() {
		// 작업 스레드 코드 작성
		//'삐' 소리내는 작업
		for (int i = 0; i < 5; i++) {
			System.out.println("삐~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}
