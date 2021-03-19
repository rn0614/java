package ch13.sec02;

import ch13.sec02.MyFunctionalInterface;

// 매개변수가 1개인 람다식
// 매개값으로 2 전달
// 결과는 x*5한 결과 출력하는 람다식 작성
// 10 출력

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 매개변수가 1개인 람다신
		fi= (x)-> {
			int result =x*5;
			System.out.println(result);
		};
		
		fi.method(2);
		
		//실행 문장이 1개인 경우 중괄호{}; 생략 가능
		//매개변수가 1개인 경우 괄호() 생략 가능
		fi=x-> System.out.println(x*5);
		fi.method(2);
		
		//실행문이 여러개일 경우 return문으로 실행문장중 하나 선정
	}

}
