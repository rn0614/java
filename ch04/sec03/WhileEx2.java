package ch04.sec03;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("�л� �� �Է� : ");
		int num, i=1, sum=0;
		int score;
		num=sc.nextInt();
		while(i<=num) {
			System.out.print("�л�"+i+"�����Է� : ");
			score=sc.nextInt();
			sum+=score;
			i++;
		}
		sc.close();
		System.out.println("���� : "+ sum);

	}

}
