package ch06.sec03;

import java.util.Scanner;

public class MemberEX {

	public static void main(String[] args) {
		String id,name,pn,state;
		int old;
		
		Member m1 = new Member();
		m1.showMember();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("---------------------");
		System.out.print("���̵� �Է� :");
		id=sc.next();
		System.out.print("���� �Է� :");
		name=sc.next();
		System.out.print("���� �Է� :");
		old=sc.nextInt();
		System.out.print("��ȭ��ȣ �Է� :");
		pn=sc.next();
		System.out.print("�ּ� �Է� :");
		state=sc.next();
		sc.close();
		
		//�˱Ը�Ʈ
		Member m2 = new Member(id,name,old,pn,state);
		m2.showMember();

	}

}
