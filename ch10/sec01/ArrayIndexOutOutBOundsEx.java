package ch10.sec01;

public class ArrayIndexOutOutBOundsEx {
	public static void main(String[] args) {
		if(args.length ==2) {
			String data1 =args[0];
			String data2 =args[1];
			String data3 =args[2];
		
			System.out.println("args[0]:"+data1);
			System.out.println("args[1]:"+data2);
			System.out.println("args[2]:"+data3);
		}else {
			System.out.println("[������]");
		}
		//�߻�����
		//main()�޼ҵ��� agr�� ���޵Ǵ� ���� ��� �߻��ϴ� ����
		// args�� �� �����ϴ� �� : Run/Run Configuration �忡�� Argument �ǿ� �Է�
		
		
		
	}
}
