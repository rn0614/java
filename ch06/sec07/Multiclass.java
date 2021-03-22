package ch06.sec07;

import java.util.Scanner;

//하나의 java 파일에 여러 클래스 작성

class Add {
	private int a,b;
	
	//생성자 :필드 값 초기화
	public Add(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	// 메소드
	public void calculate() {
		System.out.println("더하기"+(a+b));
	}	
}

class Substract {
	private int a,b;
	
	//생성자 :필드 값 초기화
	public Substract(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	// 메소드
	public void calculate() {
		System.out.println("빼기"+(a-b));
	}	
}
class Multiply {
	private int a,b;
	
	//생성자 :필드 값 초기화
	public Multiply(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	// 메소드
	public void calculate() {
		System.out.println("곱하기"+(a*b));
	}	
}



public class Multiclass {
	public static void main(String[] args) {
		// 연산할 숫자와 연산자를 입력받아서 연산 결과를 출력
		// switch문을 사용해서 연산자에 해당하는 클래스의 객체 생성해서 메소드 생성
		int a,b;
		char c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 :");
		a=sc.nextInt();
		System.out.print("정수 2 입력 :");
		b=sc.nextInt();
		System.out.print("연산자 입력 :");
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
			System.out.println("잘못된 연산입니다.");
		}
		sc.close();
		
	}

}
