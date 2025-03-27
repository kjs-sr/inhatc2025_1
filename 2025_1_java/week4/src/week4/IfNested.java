package week4;

public class IfNested {
	public static void main(String[] args) {
		//점수 : 0~99
		int score = (int)(Math.random() * 100);
		String grade;
		
		if(score > 90) {
			if(score > 95)
				grade = "A+"; 
			else if (score > 93)
				grade = "A0";
			else
				grade = "A-";
		}
		else
			grade = "B";
		System.out.println(score);
		System.out.println(grade);
	}
}
