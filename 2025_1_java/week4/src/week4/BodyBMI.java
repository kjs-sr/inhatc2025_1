package week4;

import java.util.Scanner;

public class BodyBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("키(cm)을 입력하세요 : ");
		int height = sc.nextInt();
		
		System.out.print("몸무게(kg)을 입력하세요 : ");
		int wegiht = sc.nextInt();
		System.out.println(name+"님의 키는 "+height+"cm이고 몸무게는 "+wegiht+"kg입니다.");
		
		double mHeight = (double)height / 100;
		double bmi = wegiht/(mHeight*mHeight);
		String BMIresult;
		if(bmi>=30)
			BMIresult = "고도비만";
		else if(bmi>=25)
			BMIresult = "비만";
		else if(bmi>=23)
			BMIresult = "과체중";
		else if(bmi>=18.5)
			BMIresult = "정상";
		else
			BMIresult = "비정상";
		System.out.printf("%s님의 BMI는 %.2f이고 %s입니다.",name,bmi,BMIresult);
		sc.close();
	}
}
