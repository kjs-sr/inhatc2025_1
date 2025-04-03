package week5;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		int score;
		char grade;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("점수 입력 >>");
			score = sc.nextInt();
			System.out.println();
			if(score < 0)
				break;
			
			if(score >= 90)
				grade = 'A';
			else if(score >= 80)
				grade = 'B';
			else if(score >= 70)
				grade = 'C';
			else if(score >= 60)
				grade = 'D';
			else
				grade = 'F';
			System.out.println("SCORE\t\t\tGTADE");
			System.out.println("==============================");
			System.out.println(score+"\t\t\t"+grade);
			System.out.println();
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
