package week5;

public class Gugudan2 {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			System.out.println("============");
			System.out.println("구구단 : "+i+"단");
			System.out.println("============");
			for(int j=1; j<10; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
	}
}
