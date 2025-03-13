package week2;

public class Casting {
	public static void main(String[] args) {
		//강제 타입 변환
		int iData = 65;				//int = 4byte
		char cData = (char)iData;	//char = 2byte
		System.out.println(cData);
		
		long lData = 500;			//long = 8byte
		iData = (int)lData;
		System.out.println(iData);
		
		double dData = 3.14;
		iData = (int)dData;
		System.out.println(iData);
		
		//casting 하기 전에 데이터 손실 확인
		int iValue = 128;
		byte bValue = (byte)iValue;
		System.out.println(bValue);
		if(iValue >= Byte.MIN_VALUE && iValue <= Byte.MAX_VALUE) {
			bValue = (byte)iValue;
		}else {
			System.out.println("Casting 하고자 하는 변수의 값을 확인하세요.\n범위를 확인하세요.");
		}
	}
}
