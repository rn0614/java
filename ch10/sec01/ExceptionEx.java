package ch10.sec01;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		// ���� 2�� �Է� �ް�
		// ������ ���� : 0���� ������ ���� (����ó������)
		// 0���� ������
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.print("����1 �Է� : ");
		x=sc.nextInt();
		System.out.print("����2 �Է� : ");
		y=sc.nextInt();
		
		try { 
			System.out.println("������ ��� :"+x/y);
			
		} catch (ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
	}
}
