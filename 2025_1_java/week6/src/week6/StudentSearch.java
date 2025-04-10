package week6;

import java.util.Scanner;

public class StudentSearch {
	public static void main(String[] args) {
		String[] students = {"홍길동", "이순신", "강감찬", "김철수", "이영희"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾고 싶은 학생 >> ");
		String name = sc.next();
		
		//찾은 경우 정보 저장
		boolean found = false;
		for(int i=0; i<students.length; i++) {
			if(students[i].equals(name)) {
				found = true;
				break;
			}
		}
		
		if(found)
			System.out.println(name+" 학생이 명단에 있다.");
		else
			System.out.println("해당 학생은 명단에 없다.");
		sc.close();
	}
}
