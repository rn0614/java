package ch06.sec02;


public class Circle {
	//�ʵ�
	//������ �� radius
	int radius;
	
	//�޼ҵ�
	//setCircle()
	//�ʵ� radius �� ����
	public void setCircle(int x){
		
		radius=x;
		
	}
	
	public float area(){
		System.out.print("���� ���� :");
		
		return radius*radius*3.14f;
	}
	
	
	// aerea()�� ����

	
}
