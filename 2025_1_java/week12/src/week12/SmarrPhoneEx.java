package week12;
import java.util.Scanner;

public class SmarrPhoneEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		SmartPhone sp = new SmartPhone();
		EarPhone ep = null;
		
		System.out.println("** 스마트 폰으로 음악 재생하기 **");
		
		while(true) {
			System.out.println("\n연결한 이어폰 선택(1.Buds 2.AirPods 3.TonFree 4.종료");
			menu = sc.nextInt();
			if(menu == 4)
				break;
			if(menu == 1)
				ep = new Buds();
			else if(menu == 2)
				ep = new AirPods();
			else if(menu == 3)
				ep = new TonFree();
			
			sp.musicOn(ep);
			sp.musicOff(ep);
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
