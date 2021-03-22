package ch03.sec04;

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 49; //65
		
		if((charCode >=65)&(charCode<=90)){
			System.out.println("대문자네요");
		}
		
		if((charCode >=97)&(charCode<=122)){
			System.out.println("소문자네요");
		}

		if(!(charCode <48)&!(charCode>57)){
			System.out.println("0~9 사이네요");
		}
		int value = 5;
		
		if((value%2==0)&(value%3==0)) {
			System.out.println("2또는 3의배수");
		}
		else {
			System.out.println("2또는 3의 배수 아님");
			
		}
		
	}

}
