package week14;

public class Box2Ex {
	public static void main(String[] args) {
		Box2<String> b1 = new Box2<String>();
		b1.setT("홍길동");
		//b1.setT(100);
		String sval = b1.getT();
		Box2<Integer> b2 = new Box2<Integer>();
		b2.setT(100);
		int iVal = b2.getT();
	}
}
