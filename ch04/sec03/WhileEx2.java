package ch04.sec03;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int num, i=1, sum=0;
		int score;
		num=sc.nextInt();
		while(i<=num) {
			System.out.print("학생"+i+"점수입력 : ");
			score=sc.nextInt();
			sum+=score;
			i++;
		}
		sc.close();
		System.out.println("총점 : "+ sum);

	}

}
