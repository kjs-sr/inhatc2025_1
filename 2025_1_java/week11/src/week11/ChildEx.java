package week11;

public class ChildEx {
	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
		child.filed1 = "aaa";
		child.filed2 = "bbb";
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("자동타입 변환");
		//클래스의 자동타입 변환
		//부모클래스 변수 <= 자식 객체를 대입
		Parent parent = child;
		parent.filed1 = "aaa";
		//parent.filed2 = "bbb";
		
		parent.method1();
		
		//자동타입 변환이 적용된 경우, 
		//부모 클래스 변수라도 자식클래스의 재정의된 메ㅗ드가 호출된다.
		parent.method2();
		
		//자식객체가 부모클래스 변수에 자동타입 변환이 되면
		//자식 클래스에만 정의된 메소드는 호출할 수 없다.
		//parent.method3();
		
		//자식 객체로 강제타입 변환(casting)
		//자식객체로 자동타입변환된 부모 객체만 casting 가능
		child = (Child)parent;
		child.filed2 = "bbb";
		child.method3();
		
		//순수 부모 객체로 확인
		Parent parent2 = new Parent();
		child = (Child)parent2;
		child.filed2 = "bbb";
		child.method3();
	}
}
