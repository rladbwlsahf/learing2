package human27;

public class Student {
	String StudentId;
	String StudentName;
	String StudentMajor;
	
	//수강 과목과 점수를 배열로 선언했었음.
	//새로운 클래스를 통해서 만들 예정.
	Subject[] sub = new Subject[5]; //배열생성
	//5개의 과목방을 만들어서 과목명과 점수를 관리할 수 있게끔 처리.
	
	public Student(String StudentId,String StudentName,
			String StudentMajor,String[]courseName) {
	this.StudentId = StudentId;
	this.StudentName = StudentName;
	this.StudentMajor = StudentMajor;
	for(int a=0; a<5; a++) {
		sub[a]= new Subject(courseName[a]);// Subject 생성자
		}
	}
	public void setCouresScore(String courseName,int courseScore) {
		for (int a=0; a<5; a++) {
			if (courseName.equals(sub[a].subjectName)) {
				sub[a].subjectScore = courseScore;
				break;
			}
	}
	
}
	public void showInfo() {
	System.out.printf("%s 님의 점수 \n",this.StudentName);
		for (int a=0; a<5; a++) {
			System.out.printf("%s : %d \n",sub[a].subjectName, sub[a].subjectScore);
		}
	}
	
}
	
