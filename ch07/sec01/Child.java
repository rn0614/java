package ch07.sec01;

//Child classs: parent���� ��ӹ���
// Ű���� extend ���
public class Child extends Parent{
	//Child Ŭ������ �ʵ�
	private int c;
	
	public void setChild() {
		c=20;
	}
	public void showChild() {
		// parent Ŭ���� ��� ����
		showParent();
		System.out.println("�ڽ� Ŭ������ c:"+c);
	}
}
