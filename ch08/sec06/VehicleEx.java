package ch08.sec06;

public class VehicleEx {

	public static void main(String[] args) {
		//�������̽� ������ Bus ��ü ����
		//Vehicle Ÿ������ �ڵ� Ÿ�� ��ȯ �߻�
		
		Vehicle vehicle = new Bus();
		
		//vehicle Ÿ������ Vehicle ����� ��밡��
		vehicle.run();
		
		//Vehicle Ÿ������ �ڵ� ��ȯ�Ǿ��� ������
		//vehicle.checkFare(); //Bus ��� ����ؼ� ����
		
		//Bus ����� ����Ϸ��� �ٽ� Ÿ�� ��ȯ - ���� Ÿ�� ��ȯ
		Bus bus=(Bus)vehicle;
		
		bus.run();
		bus.checkFare();
		
		
		

	}

}
