package ch04.sec03;

//���� ���� ����
//(1) math.random()���
//(2) Random Ŭ���� ���
public class RandomNum1 {

	public static void main(String[] args) {
		// (1) math.random()���
		for(int i=1; i<=10;i++) {
			//int num =(int)(Math.random()*10);// 0~9���� ������ ��
			int num =(int)(Math.random()*10)+1;// 1~10���� ������ ��
			
			System.out.println(num);
		
		
		}

	}

}
