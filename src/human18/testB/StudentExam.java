package human18.testB;

import human18.testA.Student;

public class StudentExam {

	public static void main(String[] args) {
		// 다른 패키지의 클래스를 사용하는 방법
		// case1.패키지 명을 붙임.
		human18.testA.Student s1 = new human18.testA.Student("김우진",97);
		s1.showInfo();
		
		//case2.import 사용
		Student s2 = new Student ("김우주",95);
		s2.showInfo();

	}

}
