package ch13.sec04;

// ���ٽ� ���� ��Ͽ��� Ŭ���� ���(�ʵ�, �޼ҵ�)�� ���� ���� ���

public class UsingThis {
	public int outerField =10;
	public int field =100;
	
	
	class Inner{
		int InnerField =20;
		int field =200;
		
		void method() {
			//���ٽ�
			MyFunctionalInterface fi =()->{
				//�ʵ���� �ٸ� ���
				System.out.println("outterField :" +outerField );
				System.out.println("InnerField :" +InnerField );
				
				//�ʵ���� ������ ���
				System.out.println("outter :"+field);
				System.out.println("inner :"+field);
				
				//�ٱ� Ŭ���� filed ��
				System.out.println("outter: "+ UsingThis.this.field);
				
				//���� Ŭ���� field ��
				System.out.println("outer"+this.field);
			};
			
			fi.method();
		}
	}
}
