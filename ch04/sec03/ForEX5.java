package ch04.sec03;

import java.util.Scanner;

public class ForEX5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student;
		int score;
		int sum=0;
		System.out.print("�л��� �Է� : ");
		student=sc.nextInt();
		for(int i=1; i<=student;i++) {
			System.out.print("�л�1 ���� �Է� : ");
			score=sc.nextInt();
			sum+=score;
		}
		sc.close();
		System.out.println("��� :" + (sum/(float)student) );
	}

}
