package ch03.sec04;

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 49; //65
		
		if((charCode >=65)&(charCode<=90)){
			System.out.println("�빮�ڳ׿�");
		}
		
		if((charCode >=97)&(charCode<=122)){
			System.out.println("�ҹ��ڳ׿�");
		}

		if(!(charCode <48)&!(charCode>57)){
			System.out.println("0~9 ���̳׿�");
		}
		int value = 5;
		
		if((value%2==0)&(value%3==0)) {
			System.out.println("2�Ǵ� 3�ǹ��");
		}
		else {
			System.out.println("2�Ǵ� 3�� ��� �ƴ�");
			
		}
		
	}

}
