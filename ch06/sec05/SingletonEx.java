package ch06.sec05;

public class SingletonEx {

	public static void main(String[] args) {
		//�����ڸ� private ���Ƴ��� ������ not visible ����
		//Singleton obj1 = new Singleton();

		//�ܺο� ������
		//static �޼ҵ��� getInstance() ȣ���ؼ�
		//��ü�� ��ȯ
		Singleton obj1 =Singleton.getInstance();
		
	}

}
