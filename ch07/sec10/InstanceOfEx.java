package ch07.sec10;

public class InstanceOfEx {
	
	// ���� Child ��ü�� Parent Ÿ������ �ڵ� Ÿ�� ��ȯ�� ���
	// �ٽ� Child Ÿ������ ���� Ÿ�� ��ȯ
	// �����ϱ� ���� ��ü Ÿ���� Ȯ���ؼ� ���ܰ� �߻����� �ʰ� �ϴ� �޼ҵ�
	
	public static void method1(Parent parent) {
		//������ ��ü�� �������� �ν���Ʈ�̸� true
		if(parent instanceof Child) {
			Child child =(Child) parent;
			System.out.println("method1 -Child ��ȯ ����");
		}else {
			System.out.println("method1-Child ��ȯ���� ����");
		}
	}
	
	// ���� Child ��ü�� Parent Ÿ������ �ڵ� Ÿ�� ��ȯ�� ���
	// �ٽ� Child Ÿ������ ���� Ÿ�� ��ȯ
	// �����ϱ� ���� ��ü Ÿ���� Ȯ������ ����.
	// Parent ��ü�� ������ �׳� ���� Ÿ�� ��ȯ�� �����Ѵٰ� ���� �߻�
	public static void method2(Parent parent) {
		Child child =(Child)parent;
		System.out.println("method2 -Child ��ȯ ����");
	}
	

	public static void main(String[] args) {
		//���� Ÿ�� ��ȯ ������ parentA
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		//���� Ÿ�� ��ȯ�� �ȵǴ� ParentB
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
		
	}

}