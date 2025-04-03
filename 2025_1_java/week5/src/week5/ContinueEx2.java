package week5;

public class ContinueEx2 {
	public static void main(String[] args) {
		int result = 0;
		int result2 = 0;
		for(int i=1; i<=100; i++)
		{
			if(i%3 == 0) {
				result2+=i;
				continue;
			}
			result+=i;
		}
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result+result2);
	}
}
