package week14;

public class BoxEx {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObj("Hello");
		System.out.println(box.getObj());
		String sval = (String)box.getObj();
		
		box.setObj(100);
		int ival = (int)box.getObj();
	}
}
