package ch06.sec01;

import java.util.Scanner;

public class Rectangle {
	//�ʵ�
	int width;
	int height;
	
	//�޼ҵ�
	public void input() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("���� ���� �Է�");
		width =sc.nextInt();
		
		System.out.println("���� ���� �Է�");
		height =sc.nextInt();
		
		sc.close();
	}
	
	public void area() {
		System.out.println("�簢���� ���� : "+width*height);
	}

}