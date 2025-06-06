package week10;

public class SonicAirPlane extends AirPlane{
	//비행 모드 포기값 설정
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	private int soundSpeed;
	private int maxSpeed;
	
	//부모 매소드를 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC)
			System.out.println("음속 비행");
		else
			super.fly();
	}
	
	public int getSoundSpeed() {
		return soundSpeed;
	}
	public void setSoundSpeed(int soundSpeed) {
		this.soundSpeed = soundSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
