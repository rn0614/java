package ch04.sec03;

//for��


public class For {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		// �ۿ��� ����Ϸ��� for �� �ۿ��� ��������
		int sum=0;
		int i;
		
		for(i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~"+(i-1)+"�� : " +sum);
		System.out.println(sum);

	}

}
