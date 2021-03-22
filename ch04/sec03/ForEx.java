package ch04.sec03;

public class ForEx {

	public static void main(String[] args) {
		int i=1, sum=0;
		for(i=1; i<=10;i+=2) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("1~"+(i-1)+"È¦¼öÀÇ ÇÕ"+sum);
	}

}
