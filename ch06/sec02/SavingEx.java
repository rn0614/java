package ch06.sec02;

public class SavingEx {

	public static void main(String[] args) {
		Savings sav1 = new Savings();
		sav1.setName();
		sav1.setBalance();
		sav1.getName();
		sav1.inputDeposit();
		System.out.println("���� : "+sav1.getInterest());
		System.out.println("�����ܾ� : "+sav1.getBalance());
		
	}

}
