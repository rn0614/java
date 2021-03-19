package ch13.sec05;

import ch13.sec01.MyFunctionalInterface;

// 람다식에서 메소드의 매개변수 또는 로컬 변수는 final 특성을 가져야하나
// final 카워드 생략해도 final 특성을 가짐 (java8부터)

public class UsingLocalVariable {
	// 매개변수를 기준 메소드
	void method(int arg) { // 매개변수 arg는 final 특성을 가짐
		int localVar=40;  // localVar는 final 특성 가짐
		
		
		// 람다식
		MyFunctionalInterface f1 = ()-> {
			
			// 매개 변수 사용
			System.out.println("arg"+ arg);
			// 로컬 변수 사용
			System.out.println("localVar"+localVar);
			
		};
		f1.method();
		
	}
}
