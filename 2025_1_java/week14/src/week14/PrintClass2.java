package week14;

public class PrintClass2<T> {
	//타입 파라미터(T) : 대이터 타입이 정해지지 않은 경우
	public void printVal(T value) {
		System.out.println("value = "+value);
	}
}
