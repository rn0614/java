package ch06.sec02;

import java.util.Scanner;

public class Savings {
	String name;
	int deposit,balance;
	float interest;
	
	public void setName() {
		name="ȫ�浿";
		System.out.println("������ : "+name);
	}
	public void setBalance() {
		balance=10000;
		System.out.println("������ �ܾ� :"+balance);
	}
	
	public String getName() {
		return name;
	}
	public void inputDeposit(){
		Scanner sc= new Scanner(System.in);
		System.out.print("���ݾ� �Է� :");
		deposit=sc.nextInt();
		balance+=deposit;
		sc.close();
	}
	public int getInterest(){
		interest=balance*0.1f;
		return (int)interest;
	}
	public int getBalance() {
		balance+=interest;
		return balance;
	}
	

}
