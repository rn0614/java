package ch03.sec03;

import java.util.Scanner;

public class ArithmeticOperatorEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, total ;
		float average;
		System.out.print("국어 입력 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 입력 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 입력 : ");
		math = sc.nextInt();
		
		
		System.out.println("============");
		System.out.println("총점 : "+(kor+eng+math));
		System.out.println("평균 : "+(kor+eng+math)/3);
		
		sc.close();
	}

}
