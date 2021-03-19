package ch13.sec01;

public class MyFunctionalInterfaceEx {
	// 인터페이스 변수 ;
	public static void main(String[] args) {
		// 인터페이스 변수 = 람다식
		// 매개변수 없고, 리턴값도 없는 람다식
		// 매개변수가 없으면 빈괄호() 필수
		MyFunctionalInterface f1 = ()-> {
			String str ="method call1"; // 실행 문장이 2개
			System.out.println(str);
		};
		
		// 메소드 호출 : 람다식의 중괄호 { ... } 실행
		f1.method();
		
		// 실행 문장이 1개인 경우
		// 실행 문장이 1개인 경우 중괄호{}; 생략 가능
		f1=()->{System.out.println("method call2");};
		f1.method();
		
		
		
	}

}
