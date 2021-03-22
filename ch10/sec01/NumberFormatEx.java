package ch10.sec01;

public class NumberFormatEx {

	public static void main(String[] args) {
		//숫자 100: 백
		//문자열 100 : 일영영
		String data1="100";
		String data2 ="5100";
		
		//문자열을 정수로 변환
		int value1 =Integer.parseInt(data1); //Integer.parseInt 문자열 > 숫자로 바꾸는 함수
		int value2 =Integer.parseInt(data2); // 숫자로 못바꿔서 오류생김
		
		int result = value1 + value2;
		System.out.println("결과 : " + result);

	}

}
