package ch06.sec04;

public class Share {
	int a;// �ν���Ʈ �ʵ�
	static int staticA;// ����ƽ �ʵ�
	
	
	//�ν��Ͻ� �޼ҵ�
	public void set(int n) {
		a+=n;
		staticA+=n;
	}
	
	//�ν���Ʈ �޼ҵ�
	public int showA() {
		return a;
	}
	
	public static int showStaticA() {
		return staticA;
	}
	

}
