package ch06.sec07;

import java.util.Scanner;

//�ϳ��� java ���Ͽ� ���� Ŭ���� �ۼ�

class Add {
	private int a,b;
	
	//������ :�ʵ� �� �ʱ�ȭ
	public Add(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	// �޼ҵ�
	public void calculate() {
		System.out.println("���ϱ�"+(a+b));
	}	
}

class Substract {
	private int a,b;
	
	//������ :�ʵ� �� �ʱ�ȭ
	public Substract(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	// �޼ҵ�
	public void calculate() {
		System.out.println("����"+(a-b));
	}	
}
class Multiply {
	private int a,b;
	
	//������ :�ʵ� �� �ʱ�ȭ
	public Multiply(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	// �޼ҵ�
	public void calculate() {
		System.out.println("���ϱ�"+(a*b));
	}	
}



public class Multiclass {
	public static void main(String[] args) {
		// ������ ���ڿ� �����ڸ� �Է¹޾Ƽ� ���� ����� ���
		// switch���� ����ؼ� �����ڿ� �ش��ϴ� Ŭ������ ��ü �����ؼ� �޼ҵ� ����
		int a,b;
		char c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 �Է� :");
		a=sc.nextInt();
		System.out.print("���� 2 �Է� :");
		b=sc.nextInt();
		System.out.print("������ �Է� :");
		c=sc.next().charAt(0);
		
		
		
		
		
		switch(c) {
		case '+' : 
			Add a1= new Add(a,b);
			a1.calculate(); break;
		case '-' : 
			Substract a2= new Substract(a,b);
			a2.calculate(); break;
		case '*' : 
			Multiply a3= new Multiply(a,b);
			a3.calculate(); break;
		default:
			System.out.println("�߸��� �����Դϴ�.");
		}
		sc.close();
		
	}

}
