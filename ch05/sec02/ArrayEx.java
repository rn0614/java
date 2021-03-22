package ch05.sec02;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name =new String[5];
		int[] score1 = new int[5];
		int[] score2 = new int[5];
		int[] score3 = new int[5];
		String yn;
		
		
		outter: for(int i=0;i<=5;i++){
			System.out.print((i+1)+"번 성명 입력:");
			name[i]=sc.next();
			System.out.print((i+1)+"번 문법점수 입력 입력:");
			score1[i]=sc.nextInt();
			System.out.print((i+1)+"번 듣기점수 입력 입력:");
			score2[i]=sc.nextInt();
			System.out.print((i+1)+"번 독해점수 입력 입력:");
			score3[i]=sc.nextInt();
			
			System.out.print("계속 입력하시겠습니까? (y입력하면 계속) :");
			yn=sc.next();
			if(yn.equals("y")) {
				System.out.println("\n이상");
			}else {
				break outter;
			}
		}
		System.out.println("********시험결과******");
		
		for(int i=0; i<=5;i++)
		System.out.println();
		
		
		sc.close();
	}
	

}