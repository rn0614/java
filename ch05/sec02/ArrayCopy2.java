package ch05.sec02;


// 배열복사 : System.array.arraycopy() 메소드 사용
//system.arraycopy(원본, 시작 인덱스, 대상, 시작인덱스,복사할 개수)
public class ArrayCopy2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java","Array","Copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray,0, newStrArray,0,oldStrArray.length);
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i]+",");
		
	}

}
