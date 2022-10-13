package human02;

public class StudentExam {

	public static void main(String[] args) {
		Student st1 = new Student();
		
		System.out.println("st1 ==> " + st1);
		// st1 => human02.Student@7c30a502
		// (객체의 정보를 담고 있는 heap 영역의 주소)
		System.out.println("st1.name ==>" + st1.name);
		System.out.println("st1.age ==>" + st1.age);
		
		Student st2 = new Student();
		System.out.println("st2 ==> " + st2);
		// st2 => human02.Student@49e4cb85
		// st2의 정보를 담고있는 heap 영역의 주소
		System.out.println("st2.name ==>" + st2.name);
		System.out.println("st2.age ==>" + st2.age);
		
		st2.name = "김진우";
		st2.age=20;
		System.out.println("st2.name ==>" + st2.name);
		System.out.println("st2.age ==>" + st2.age);
		//추가 변동사항 넣기
		
	}

}
