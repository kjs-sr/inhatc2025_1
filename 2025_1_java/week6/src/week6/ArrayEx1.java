package week6;

public class ArrayEx1 {
	public static void main(String[] args) {
		//배열 선언과 생성
		//값 목록으로 생성하는 방법
		int[] score = {70,80,90,85,95};
		String[] pNames = {"java","c","python","c#"};
		double[] dArray1;
		dArray1 = new double[]{0.1,0.2,0.3,0.4};
		
		//new 연산자로 배열 생성
		int[] intArray = new int[5];
		System.out.println("intArray[0] = "+intArray[0]);
		
		double[] dArray2 = new double[5];
		System.out.println("dArray2[0] = "+dArray2[0]);
		
		String sArray[] = new String[5];
		System.out.println("sArray[0] = "+sArray[0]);
		
		//sArray =pNames;
		for(int i=0; i<pNames.length; i++) {
			sArray[i] = pNames[i];
			System.out.printf("sArray[%d] = %s",i,sArray[i]);
		}
	}
}
