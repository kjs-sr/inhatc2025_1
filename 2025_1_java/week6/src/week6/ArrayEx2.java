package week6;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] score = new int[10];
		int sum = 0;
		System.out.println("=== 랜덤 생성된 점수 배열 ===");
		for(int i=0; i<score.length;i++) {
			score[i] = (int)(Math.random() * 100);
			System.out.printf("score[%d] = %d\n",i,score[i]);
			sum+=score[i];
		}
		System.out.println("=== 총점 및 평균 ===");
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+(double)sum/score.length);
	}
}
