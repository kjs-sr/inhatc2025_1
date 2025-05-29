package week13;

public class DataBox {
	//공유 객체
	private String data;
	
	public synchronized String getData() throws InterruptedException {
		//소비자가 data를 읽는 메소드
		//읽을 data가 있는 경우에만 읽어야 함
		//data가 있는지 확인
		if(this.data == null) {
			//data가 없는 경우 => 읽으면 안됨
			wait();
		}
		//DataBox에 data가 있는 경우
		String returnValue = data;
		System.out.println("Consumer Thread가 읽은 데이터 : "+returnValue);
		
		//data를 읽고나서 data를 비워주기
		this.data = null;
		
		//소비자가 data를 읽는 동안, 생상자는 wait()
		//생상자가 data를 쓸 수 있도록 꺠우기 => notify()
		notify();
		
		return returnValue;
	}
	public synchronized void setData(String data) throws InterruptedException {
		//생산자가 data를 쓰는 메소드
		//DataBox에 data가 없어야만 쓰기가 가능
		//data가 있는지 없는지 확인
		if(this.data != null) {
			//data가 있는 경우
			wait();
		}
		
		//data가 없는 경우 쓰기 가능
		
		
		this.data = data;
		System.out.println("Producer Thread가 생성한 데이터 : "+data);
		
		//생산자가 data를 쓰는 동안, 소비자는 wait()
		//소비자가 읽을 수 이쏘록 깨우기 => notify()
		notify();
	}
}
