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
		System.out.print("아이디 입력 :");
		id=sc.next();
		System.out.print("성명 입력 :");
		name=sc.next();
		System.out.print("나이 입력 :");
		old=sc.nextInt();
		System.out.print("전화번호 입력 :");
		pn=sc.next();
		System.out.print("주소 입력 :");
		state=sc.next();
		sc.close();
		
		//알규먼트
		Member m2 = new Member(id,name,old,pn,state);
		m2.showMember();

	}

}
