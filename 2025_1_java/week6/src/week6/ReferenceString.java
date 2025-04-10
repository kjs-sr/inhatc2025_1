package week6;

public class ReferenceString {
	public static void main(String[] args) {
		//String 클래스 타입 변수
		String ssn = "8606241230123";
		
		//String 변수는 0부터 인덱스를 가짐
		char gender = ssn.charAt(6);
		switch(gender) {
		case '1', '3' -> System.out.println("남자");
		case '2', '4' -> System.out.println("여자");
		}
		
		//문자열의 길이
		int length = ssn.length();
		if(length == 13)
			System.out.println("올바른 주민번호");
		else
			System.out.println("잘못된 주민번호");
		
		//문자열 대체
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//문자열 잘라내기(가져오기, 추출하기)
		//0번(처음)부터 5번(6번 앞까지) 가져오기
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		//6번 인덱스부터 끝까지 가져오기
		String secondNum = ssn.substring(6);
		System.out.println(secondNum);
		
		//문자열 찾기
		//String oldStr = "자바 프로그래밍";
		//"프로그래밍" 단어가 몇 번 index에 있나?
		int index = oldStr.indexOf("프로그래밍");
		if(index == -1) {
			System.out.println("프로그램 단어가 포함되어있지 않음");
		}else {
			System.out.println(index +"번 인덱스에 프로그래밍 단어가 있음");
		}
		
		//문자열 포함 여부 확인
		boolean result = oldStr.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 문자열");
		}else {
			System.out.println("자바와 관련 없는 문자열");
		}
		
		//문자열 분리
		String board = "1,자바학습,참조타입 String 클래스,홍길동";
		String[] tokens = board.split(",");
		for(int i=0; i < tokens.length; i++) {
			//System.out.print(tokens[i] + " ");
		}
		
		//향상된 for 문 적용
		for(String token : tokens) {
			System.out.println(token);
		}
	}
}
