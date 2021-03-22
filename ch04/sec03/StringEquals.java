package ch04.sec03;

public class StringEquals {

	public static void main(String[] args) {
		String strVar1 ="홍길동";
		String strVar2 ="홍길동";
		
		//동일한 객체 참조여부
		if(strVar1 ==strVar2) {
			System.out.println("서로 참조가 같음");
		}else {
			System.out.println("참조가 다름");
		}
		
		//문자열이 동일한지 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("문자열이 같음");
		}else {
			System.out.println("문자열이 다름");
		}
		
		
		
		
		
		String strVar3 =new String("홍길동");
		String strVar4 ="홍길동";
		
		//동일한 객체 참조여부
		if( strVar3 ==strVar4) {
			System.out.println("서로 참조가 같음");
		}else {
			System.out.println("참조가 다름");
		}
		
		//문자열이 동일한지 비교
		if(strVar3.equals(strVar4)) {
			System.out.println("문자열이 같음");
		}else {
			System.out.println("문자열이 다름");
		}

	}

}
