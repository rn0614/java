/*package ch13.sec08;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx1 {
	//Student ��ü�� ���� �÷���(���� ��ü�� ���� ���� ��ü) ����
	private static List<Student> list = Arrays.asList(
			new Student("Ȧ�浿",90,95),// Student ��ü1
			new Student("�ſ��",95,93)// Student ��ü2
	);
	
	
	// int Ÿ�� ��� �޼ҵ� ����
	// �Ű������� ToIntFunction �Լ��� �������̽� Ÿ�� ���
	// �Ű����� Student�� �޾Ƽ� int�� ����
	
	public static void printString(Function<Student,String> functoion) {
		for(Student student : list) {
			// ��µǴ� ���� printInt()�� �Ű������� ���޵Ǵ� ���ٽĿ� ���� �޶���
			System.out.println(function.apply(student)+" ");
		}
	}
	public static void printInt(ToIntFunction<Student> functoion) {
		for(Student student : list) {
			// ��µǴ� ���� printInt()�� �Ű������� ���޵Ǵ� ���ٽĿ� ���� �޶���
			System.out.println(function.applyAsInt(student)+" ");
		}
	}
	
	
	public static void main(String[] args) {
		printString(t-> t.getName());
		printInt(t->t.getEnglishScore);
		printInt(t->t.getMathScore);
	}

}*/
