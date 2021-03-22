package ch04.sec02;

import java.util.Scanner;

public class SwitchEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.println("점수입력");
		score=sc.nextInt();
		
		score=score/10;
		
		switch(score) {
		case 10 : System.out.println("A"); break; 
		case 9 : System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		case 6: System.out.println("D"); break;
		default : System.out.println("F"); break;
		}
		sc.close();

	}

}
