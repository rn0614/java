package ch05.sec02;

// ���� for�� : �迭 �� �÷����� �׸��Ҹ� ���������� ���
// �ε����� ������� �ʰ� �ٷ� �׸� ���(����)�ݺ�

public class AdvancedFor {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		int sum =0;
		
		for(int score : scores) {
			sum+=score;
		}
		System.out.println("����: " + sum);
		
		double avg = sum/ (double)scores.length;
		System.out.println("���: "+avg);
		
	}

}
