package ch07.sec05;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 클래스의 areaCircle()을 실행");
		return Math.PI*r*r;
	}
	

}
