package ch02.sec01;

// 리터럴 : 변수에 저장되는 값
public class Literal {

	public static void main(String[] args) {
		int score = 95; // 정수 리터럴
		double average =85.5;
		char familyName = '김'; // 문자 리터럴
		String name = "홍길동";    // 문자열 리터럴
		boolean result = true; // 논리 리터럴
		
		System.out.println(score);
		System.out.println(average);
		System.out.println(familyName);
		System.out.println(name);
		System.out.println(result);
	}

}
// 블럭에서 나가면 변수가 안통한다.
// 기본타입 8개 byte char short int long float double boolean