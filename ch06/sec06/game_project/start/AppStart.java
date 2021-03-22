package ch06.sec06.game_project.start;

import java.util.Scanner;

public class AppStart {

	public static void main(String[] args) {
		System.out.println("********************"
				+ "\n게임에 오신것을 환영합니다^^"
				+ "\n********************"
				+ "\n        메뉴"
				+ "\n********************"
				+" \n1번\n2번 \n3번\n4번\n");
		Scanner sc= new Scanner(System.in);
		System.out.print("메뉴 번호 입력 : ");
		int number;
		number=sc.nextInt();
		
		switch(number) {
		case 1 : 
			//GaBaBo g1=new GaBaBo();
		
		}
		sc.close();

	}

}
