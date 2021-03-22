package ch07.sec05;


public class Calculator {
	
	//재정의 : 내용 수정
	// 좀더 정밀한 계산을 위해서
	// 부모 메소드에서 사용한 3.14159가 아닌 Math.PI상수 이용
	double areaCircle(double r) {
		System.out.println("Calculator 클래스의 areaCircle()을 실행");
		return Math.PI*r*r;
	}

}
