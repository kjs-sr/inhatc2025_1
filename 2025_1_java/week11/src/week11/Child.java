package week11;

public class Child extends Parent {
	String filed2;
	
	//Parent 클래스의 method2() 재정의
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	//method3() 추가 : Child 클래스에만 정의된 
	public void method3() {
		System.out.println("Child-method3()");
	}
}
