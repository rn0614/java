package ch02.sec03;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 =10;
		byte byteValue2 =20;
		// 정수 연산일 경우 int 타입이 기본 따라서 byte, char, short는
		//int 타입으로 변환한 후 연산 수행
		
		int intValue =byteValue1 + byteValue2;
		System.out.println(intValue);
		
		// char 타입 + char 타입 : int 타입
		char charValue1= 'A';
		char charValue2= 1;
		//char charValue3= charValue1+ charValue2; //컴파일 오류
		int intValue2=charValue1+ charValue2;
		System.out.println("유니코드 "+ intValue2);
		System.out.println("문자 "+ (char)intValue2);
		
	}
	
	

}
