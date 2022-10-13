package human08;

public class StudentExam {

	public static void main(String[] args) {
		Student st1 = new Student("김우진",1,10,60,70,80);
		
		int tot = st1.getTotal();
		double avg = st1.getAVG();
		System.out.printf("이름 : %s \n ", st1.name);
		System.out.printf("총점 : %d \n ", tot);
		System.out.printf("이름 : %f \n ", avg);
		
		System.out.println("-------------------");
		
		Student st2 = new Student("김민찬",2,20,30,40,50);
		
		tot = st2.getTotal();
		avg = st2.getAVG();
		System.out.printf("이름 : %s \n ", st2.name);
		System.out.printf("총점 : %d \n ", tot);
		System.out.printf("이름 : %f \n ", avg);
		
		System.out.println("-------------------");
		
		

	}

}
