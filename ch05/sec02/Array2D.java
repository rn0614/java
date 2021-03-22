package ch05.sec02;

public class Array2D {

	public static void main(String[] args) {
		int[][]a= {{1,2,5,2},
				   {2,3,5,4},
				   {2,3,4,5}};
		System.out.println("ÃÑ Ãâ·Â");
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.println("a["+i+"]["+j+"]:" +a[i][j]);
			}
		}

	}

}
