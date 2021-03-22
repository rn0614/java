package ch05.sec02;

public class Array1 {

	public static void main(String[] args) {
		int[] a; //배열선언 아직 메모리 할당 없음
		a=new int[3];
		
		//배열 a의 원소에 값 저장
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
