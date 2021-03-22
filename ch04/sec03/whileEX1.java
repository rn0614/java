package ch04.sec03;

public class whileEX1 {

	public static void main(String[] args) {
		int i=2;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i+=2;
		}
		System.out.println("1~"+(i-2)+" Â¦¼öÀÇ ÇÕ : "+ sum);
	}

}
