
package ch04.sec03;

public class Break2 {

	public static void main(String[] args) {
		for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					//break; //���� for���� ����
				}
			}
		}


		
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter; //���� for�� ����(���� �Ἥ ���)
				}
			}
		}
	}

}

