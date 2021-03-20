package ch14.sec06;

import java.util.Arrays;

public class WildCardEx {
	// 와일드 카드 타입 : 메소드의 매개값으로 제네릭 타입을 사용
	// 구체적인 타입 대신에 와일드 카드 (?) 형태로 사용
	
	// 와일드 카드 타입 3가지
	// (1)제네릭 타입<?> : 제한 없음(모든 타입 다 받을 수 있음)
	// (2)제네릭 타입<? extends 상위타입 > : 상위클래스 제한(상위 타입 과 그 하위 클래스만 받을 수 있음)
	// (3)제네릭 타입<? super 하위타입> : 하위클래스 제한(하위타입과 그 상위 클래스만 받을 수 있음)
	
	// (1)제네릭 타입 <?> : 제한없음
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생 :" +
				Arrays.toString(course.getStudents()));
	}
	
	// (2)제네릭 타입 <? extends 상위타입> : Student,HighStudent
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 :" +
				Arrays.toString(course.getStudents()));
	}
	// (3)제네릭 타입 <? super 하위타입> : Worker, Person
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 :" +
				Arrays.toString(course.getStudents()));
	}
	
	
	
	
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> WorkerCourse = new Course<Worker>("직장인 과정", 5);
		WorkerCourse.add(new Worker("직장인"));
		
		
		
		Course<Student> StudentCourse = new Course<Student>("학생 과정", 5);
		StudentCourse.add(new Student("학생"));
		StudentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> HighStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
		//HighStudentCourse.add(new Person("일반인"));
		//HighStudentCourse.add(new Worker("직장인"));
		//HighStudentCourse.add(new Student("학생"));
		HighStudentCourse.add(new HighStudent("고등학생"));
		
		// 모든 수강생이 다 등록 가능
		registerCourse(personCourse);
		registerCourse(WorkerCourse);
		registerCourse(StudentCourse);
		registerCourse(HighStudentCourse);
		
		// 직장인 과정
		registerCourseWorker(personCourse);
		registerCourseWorker(WorkerCourse);
		
		// 학생과정
		registerCourseStudent(StudentCourse);
		registerCourseStudent(HighStudentCourse);
		
	}

}
