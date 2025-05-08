package package1;

import week10.ClassA;

public class ClassC {
	//패키지가 다르면 반드시 import
	//public : 패키지가 달라도 호출 가능
	ClassA c1 = new ClassA(true);
	
	//default : 패키지가 달라지면 호출 불가능
	//ClassA c2 = new ClassA(10);
	
	//private : 자기 클래스 안에서만 호출 가능
	//ClassA c3 = new ClassA("홍길동");
}
