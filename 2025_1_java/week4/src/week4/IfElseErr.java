package week4;

public class IfElseErr {

	public static void main(String[] args) {
		int score = 85;
		char grade;
		
		if(score >= 90) {
			System.out.println("90이상");
			grade = 'A';
		}
		else if(score >= 80) {
			// 80 <= score < 90
			System.out.println("80이상");
			grade ='B';
		}
		else if(score >= 70) {
			System.out.println("70이상");
			grade = 'C';
		}
		else if(score >= 60) {
			System.out.println("60이상");
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);
	}

}
