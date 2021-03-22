package ch05.sec02;

// 향상된 for문 : 배열 및 컬렉션의 항목요소를 순차적으로 사용
// 인덱스를 사용하지 않고 바로 항목 요소(원소)반복

public class AdvancedFor {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		int sum =0;
		
		for(int score : scores) {
			sum+=score;
		}
		System.out.println("총점: " + sum);
		
		double avg = sum/ (double)scores.length;
		System.out.println("평균: "+avg);
		
	}

}
