package ch04.sec03;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0,num2=0,num3=0,num0;
		for(int i=1; i<=10; i++) {
			System.out.print("����"+i+"�Է� :");
			num0=sc.nextInt();
			if(num0>0) {
				num1++;
			}else if(num0==0) {
				num2++;
			}else{
				num3++;
			}
			
		}
		sc.close();
		System.out.println("\n��� ���� :"+ num1);
		System.out.println("���� ���� :"+ num3);
		System.out.println("0 ���� :"+ num2);

	}

}
