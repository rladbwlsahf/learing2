package human27;

public class StudentExam {
//	String StudentId,String StudentName,String StudentMajor,String[]courseName
	public static void main(String[] args) {
		
		String[] courseName1 = {"경제","물류","수학",
				"컴퓨터","영어"};
		
		Student s1 = new Student("K01","김우진","물리학", 
				courseName1);
		
		s1.setCouresScore("경제",80);
		s1.setCouresScore("물류",81);
		s1.setCouresScore("수학",82);
		s1.setCouresScore("컴퓨터",83);
		s1.setCouresScore("영어",84);
		s1.showInfo();
		System.out.println("--------------------- ");
		
String[] courseName2 = {"컴퓨터","수학","영어","네트워크","그래픽"};
		
		Student s2 = new Student("K02","김지훈","컴공과", courseName2);
		
		s2.setCouresScore("컴퓨터",90);
		s2.setCouresScore("수학",81);
		s2.setCouresScore("영어",85);
		s2.setCouresScore("네트워크",83);
		s2.setCouresScore("그래픽",84);
		s2.showInfo();

	}
}
