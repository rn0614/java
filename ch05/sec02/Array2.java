package ch05.sec02;

public class Array2 {

	public static void main(String[] args) {
		int[] b =new int[5];
		
		String[] flowers= {"해바라기","장미","진달래"};
		
		for(int i=0; i<b.length;i++) {
			b[i]=i;
			System.out.println("b["+i+"] = "+ b[i]);
		}
		
		for(int i=0; i<flowers.length;i++) {
			System.out.println("flowers["+i+"] = "+flowers[i]);
		}

	}

}
