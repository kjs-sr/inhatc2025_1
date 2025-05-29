package week13;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		//생산자 작업 내용
		//data를 쓰기만 하는 작업
		for(int i=1; i<=3; i++) {
			String data = "Data-" + i;
			try {
				dataBox.setData(data);
			} catch (InterruptedException e) {}
		}
	}
}
