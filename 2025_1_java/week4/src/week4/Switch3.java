package week4;

public class Switch3 {
	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			score1 = 100 - 20;
		default:
			score1 = 60;
		}
		System.out.println(score1);
		
		// 표현식에서는 변수에 값을 바로 저장 가능
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		System.out.println(score2);
	}
}
