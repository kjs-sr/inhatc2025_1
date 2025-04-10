package week6;

public class Reference1 {
	public static void main(String[] args) {
		//참조 타입 변수 : 클래스 타입
		
		//기본 데이터 타입의 비교
		int iVal1 = 100;
		int iVal2 = 100;
		System.out.println("iVal1==1Val2 : "+(iVal1==iVal2 ? true : false));
		
		//String : 대표적인 클래스 타입
		String sVal1 = "Java";
		String sVal2 = "Java";
		
		//자바는 문자열리터럴이 동일하다면 String 객체를 공유한다
		//즉, 같은 주소의 객체를 참조한다.
		System.out.println("sVal1==sVal2 : "+(sVal1==sVal2 ? "참조가 같음" : "참조가 다름"));
		
		String sVal3 = new String("Java");
		String sVal4 = new String("Java");
		System.out.println("sVal3==sVal4 : "+(sVal3==sVal4 ? "참조가 같음" : "참조가 다름"));
		System.out.println("sVal1==sVal3 : "+(sVal1==sVal3 ? "참조가 같음" : "참조가 다름"));
		
		//참조타입 변수는 초기값으로 null을 사용할 수 있다.
		//스택영역에만 생성됨
		String sVal5 = null;
		
		//null 값을 가지고 있을 때는 변수를 사용할 수 없다
		//NullPointerException 발생
		//System.out.println("sVal5.length = "+sVal5.length());
		sVal5 = "Java";
		System.out.println("sVal5 = "+sVal5);
		System.out.println("sVal1==sVal5 : "+(sVal1==sVal5 ? "참조가 같음" : "참조가 다름"));
		
		//String 객체가 동일한 문자열 값을 가지고 있는지 비교할 때는 반드시 equals() 메소드 사용
		if(sVal3.equals(sVal4)) {
			System.out.println("sVal3와 sVal4의 문자열은 동일하다.");
		}else {
			System.out.println("sVal3와 sVal4의 문자열은 다르다.");
		}
	}
}
