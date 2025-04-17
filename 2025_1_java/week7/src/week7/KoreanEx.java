package week7;

public class KoreanEx {
	public static void main(String[] args) {
		//실행 클래스
		//객체 생성
		Korean k1 = new Korean("홍길동","010203-3123456","010-2345-6789");
		
		System.out.println("k1.nation="+k1.nation);
		System.out.println("k1.name="+k1.name);
		System.out.println("k1.ssn="+k1.ssn);
		System.out.println("k1.phone="+k1.phone);
		
		Korean k2 = new Korean("김진섭","030405-3987654","010-1122-3344");
	}
}
