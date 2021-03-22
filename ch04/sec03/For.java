package ch04.sec03;

//for문


public class For {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		// 밖에서 사용하려면 for 문 밖에서 변수선언
		int sum=0;
		int i;
		
		for(i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~"+(i-1)+"합 : " +sum);
		System.out.println(sum);

	}

}
