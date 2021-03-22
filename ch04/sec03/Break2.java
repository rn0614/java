
package ch04.sec03;

public class Break2 {

	public static void main(String[] args) {
		for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					//break; //안의 for문만 종료
				}
			}
		}


		
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter; //밖의 for문 종료(라벨을 써서 명시)
				}
			}
		}
	}

}

