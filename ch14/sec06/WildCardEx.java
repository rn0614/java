package ch14.sec06;

import java.util.Arrays;

public class WildCardEx {
	// ���ϵ� ī�� Ÿ�� : �޼ҵ��� �Ű������� ���׸� Ÿ���� ���
	// ��ü���� Ÿ�� ��ſ� ���ϵ� ī�� (?) ���·� ���
	
	// ���ϵ� ī�� Ÿ�� 3����
	// (1)���׸� Ÿ��<?> : ���� ����(��� Ÿ�� �� ���� �� ����)
	// (2)���׸� Ÿ��<? extends ����Ÿ�� > : ����Ŭ���� ����(���� Ÿ�� �� �� ���� Ŭ������ ���� �� ����)
	// (3)���׸� Ÿ��<? super ����Ÿ��> : ����Ŭ���� ����(����Ÿ�԰� �� ���� Ŭ������ ���� �� ����)
	
	// (1)���׸� Ÿ�� <?> : ���Ѿ���
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "������ :" +
				Arrays.toString(course.getStudents()));
	}
	
	// (2)���׸� Ÿ�� <? extends ����Ÿ��> : Student,HighStudent
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "������ :" +
				Arrays.toString(course.getStudents()));
	}
	// (3)���׸� Ÿ�� <? super ����Ÿ��> : Worker, Person
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "������ :" +
				Arrays.toString(course.getStudents()));
	}
	
	
	
	
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> WorkerCourse = new Course<Worker>("������ ����", 5);
		WorkerCourse.add(new Worker("������"));
		
		
		
		Course<Student> StudentCourse = new Course<Student>("�л� ����", 5);
		StudentCourse.add(new Student("�л�"));
		StudentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> HighStudentCourse = new Course<HighStudent>("����л� ����", 5);
		//HighStudentCourse.add(new Person("�Ϲ���"));
		//HighStudentCourse.add(new Worker("������"));
		//HighStudentCourse.add(new Student("�л�"));
		HighStudentCourse.add(new HighStudent("����л�"));
		
		// ��� �������� �� ��� ����
		registerCourse(personCourse);
		registerCourse(WorkerCourse);
		registerCourse(StudentCourse);
		registerCourse(HighStudentCourse);
		
		// ������ ����
		registerCourseWorker(personCourse);
		registerCourseWorker(WorkerCourse);
		
		// �л�����
		registerCourseStudent(StudentCourse);
		registerCourseStudent(HighStudentCourse);
		
	}

}
