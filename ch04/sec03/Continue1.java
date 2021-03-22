package ch04.sec03;

//continue 문
// 수행중인 문장 중단, 바로 다음 반복 계속 수행
public class Continue1 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0)continue;
			System.out.println(i);
		}
	}

}
