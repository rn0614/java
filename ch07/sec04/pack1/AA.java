package ch07.sec04.pack1;

// �������� ���� ����
// ������ �����ε� : �̸� �ٸ��� ���� �� ����(�Ű����� �ٸ�)

public class AA {
	
	AA a1 = new AA(true);  //public ���� ����
	AA a2 = new AA(1); // ���ٰ���
	AA a3 = new AA("���ڿ�"); //���ٰ��� ���� Ŭ������ �ٵ�.
	
	public AA(boolean b) {} //public
	AA(int b){}//default
	private AA(String s) {}

}
