package ch03.sec03;

import java.util.Scanner;

public class ArithmeticOperatorEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, total ;
		float average;
		System.out.print("���� �Է� : ");
		kor = sc.nextInt();
		
		System.out.print("���� �Է� : ");
		eng = sc.nextInt();
		
		System.out.print("���� �Է� : ");
		math = sc.nextInt();
		
		
		System.out.println("============");
		System.out.println("���� : "+(kor+eng+math));
		System.out.println("��� : "+(kor+eng+math)/3);
		
		sc.close();
	}

}
