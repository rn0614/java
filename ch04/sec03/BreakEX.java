package ch04.sec03;

import java.util.Scanner;

public class BreakEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int present=100000;
		int less;
		System.out.println("�����ܾ� : "+present);
		
		while(true) {
			System.out.print("����� �Է� : " );
			less= sc.nextInt();
			
			if(present<less) {
				System.out.print("�ܾ׺���. �����ܾ� :"+present);
				break;
			}else {
				present-=less;
			}
			sc.close();
		}
		

	}

}
