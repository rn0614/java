package ch02.sec02;

public class DataType {

	public static void main(String[] args) {
		// 문자타입
		// ''사이에 문자
		// '\u0041' 유니코드
		// 65 아스키 코드값
		char a ='A';
		
		// 정수 타입 변수 선언 및 초기화
		System.out.println(a);
		int byteValue =10;    // 1바이트
		int shortValue =1000;			// 2,4바이트
		long longValue = 1000000000100010000L;	//8바이트
		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(longValue);
		
		String val1 = "구상모";
		System.out.println(val1);
	}

}
