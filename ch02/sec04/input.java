package ch02.sec04;

import java.util.Scanner;

//�ڵ� import Ctrl+ shift + O



// Scanner Ŭ������ �̿��� Ű �Է�
public class input {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1, num2;
		
		System.out.print("ù��° ���� �Է� : ");
		num1 =sc.nextInt(); //�Է��� ���� ������ ��ȯ
		System.out.println(num1);

		
		System.out.print("�ι�° ���� �Է� : ");
		num2=sc.nextInt();
		System.out.println(num2);
		
		int sum=num1+num2;
		int x = num1*num2;
		
		System.out.println("�μ��� �� : "+ sum);
		System.out.println("�μ��� �� : "+(num1+num2));
		sc.close();
	}

}
