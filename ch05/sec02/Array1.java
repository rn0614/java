package ch05.sec02;

public class Array1 {

	public static void main(String[] args) {
		int[] a; //�迭���� ���� �޸� �Ҵ� ����
		a=new int[3];
		
		//�迭 a�� ���ҿ� �� ����
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
