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
			System.out.print((i+1)+"�� ���� �Է�:");
			name[i]=sc.next();
			System.out.print((i+1)+"�� �������� �Է� �Է�:");
			score1[i]=sc.nextInt();
			System.out.print((i+1)+"�� ������� �Է� �Է�:");
			score2[i]=sc.nextInt();
			System.out.print((i+1)+"�� �������� �Է� �Է�:");
			score3[i]=sc.nextInt();
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y�Է��ϸ� ���) :");
			yn=sc.next();
			if(yn.equals("y")) {
				System.out.println("\n�̻�");
			}else {
				break outter;
			}
		}
		System.out.println("********������******");
		
		for(int i=0; i<=5;i++)
		System.out.println();
		
		
		sc.close();
	}
	

}