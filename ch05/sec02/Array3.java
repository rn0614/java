package ch05.sec02;

//배열 초기값 : 메모리 할당 받을 때 자료형의 기본값으로 초기화
//정수,실수, 불리언, 참조 : 0, 0.0, false, null 
public class Array3 {

	public static void main(String[] args) {
		int[] arr1 =new int[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"]:"+ arr1[i]);
		}
		
		double[] arr2 =new double[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr2["+i+"]:"+ arr2[i]);
		}
		
		String[] arr3 =new String[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr3["+i+"]:"+ arr3[i]);
		}

	}

}
