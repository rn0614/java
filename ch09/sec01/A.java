package ch09.sec01;

//��ø Ŭ����
//�з�(���� ��ġ�� ����) 
//1.��� Ŭ����: Ŭ���� ����μ� ����Ǵ� Ŭ����(���, �޼ҵ� ���� ��ġ�� ����) 
//	1)�ν��Ͻ� ��� Ŭ����:�ٱ� Ŭ���� (A)�� �����ؾ߸� ��밡�� 
//	2)static ��� Ŭ����: �ٱ� Ŭ���� (A)�� �ٷ� ���� ����(��ü �ʿ�x)

//2.���� Ŭ����: �޼ҵ� ���ο� ����Ǵ� Ŭ��������
//	-�޼ҵ尡 ����� ���� ��� ����

public class A {
	A(){ System.out.println("A ��ü ����");}
	
	//�ν��Ͻ� ��� Ŭ����
	public class B{
		B(){System.out.println("B ��ü ����");}
		//�ν��Ͻ� �ʵ� ����
		int field1;
		//static int field2; //static �ʵ� ���� �Ұ�
		
		//�ν��Ͻ� �޼ҵ� ����
		void method1() {System.out.println("BŬ������ method1 ����");}
		//static void method2(){} //static �޼ҵ� ���� �Ұ�
	}
	
	
	//static ��� Ŭ����
	static class C{
		//������
		C(){System.out.println("C ��ü ����");}
		//�ʵ� (���� ����)
		int field1;
		static int field2;
		
		//�޼ҵ�(���� ����)
		void method1() {System.out.println("CŬ���� method1����");}
		static void method2(){System.out.println("CŬ���� method1����");}
		
	}
	
	//AŬ���� ��� �޼ҵ�(static ��� �Ұ�)
	void method() {
		//���� Ŭ���� : �޼ҵ� ������ ����
		class D{
			D(){System.out.println("D��ü ����");}
			//�ʵ�
			int field1;
			//static int field2;//static ��� �Ұ�
			
			//�޼ҵ�
			void method1() {System.out.println("DŬ���� method1����");}
			//static void method2(){System.out.println("DŬ���� method1����");}
			
		}
	}
	
	
	
	
}
