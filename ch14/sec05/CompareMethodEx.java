package ch14.sec05;

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<Integer,String> p1 =new Pair<Integer,String>(1,"���");
		Pair<Integer,String> p2 =new Pair<Integer,String>(1,"���");
		
		// �� ���� ���ϴ� ���׸� �޼ҵ� compare() ȣ��
		boolean result1 = Util.<Integer,String>compare(p1, p2);
		if (result1) {
			System.out.println("���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		
		//user1, ȫ�浿
		//user2. ȫ�浿
		// ���ؼ� ���
		User1 user1 =new User1();
		User1 user2 =new User1();
		
		Pair<User1,String> p3 =new Pair<User1,String>(user1,"ȫ�浿");
		Pair<User1,String> p4 =new Pair<User1,String>(user2,"ȫ�浿");
		
		// �� ���� ���ϴ� ���׸� �޼ҵ� compare() ȣ��
		boolean result2 = Util.<User1,String>compare(p3, p4);
		if (result2) {
			System.out.println("���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		
	}
}
