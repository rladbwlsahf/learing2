package human10;

public class Exam {

	public static void main(String[] args) {
		Student s1 = new Student("james", 5000);
		Student s2 = new Student("Tomas", 10000);
		
		Bus b1 = new Bus("100번", 0, 0);
		Bus b2 = new Bus("200번", 0, 0);

		Train t1 = new Train("1호선", 0, 0);
		Train t2 = new Train("2호선", 0, 0);


		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s버스는 승객이 %d명이고, 수입이 %d원 입니다. \n", b1.busNo, b1.passengerCnt, b1.income);
		System.out.println("-------------------");
		
		s1.takeBus(b1);

		//첫번째 학생이. 첫번째 버스를 탄다.
		//첫번째 학생 :나의 돈이 1000빠짐
				//나의 돈이 1000원 보다 적으면 못탐.
		//첫번째 버스 :승객+1,수입1000증가.
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s버스는 승객이 %d명이고, 수입이 %d원 입니다. \n", b1.busNo, b1.passengerCnt, b1.income);
		System.out.println("-------------------");
		
		s2.takeTrain(t2);
		//두번째 학생이. 두번째 버스를 탄다.
		//두번째 학생 :나의 돈이 1200빠짐
		//첫번째 버스 :승객+1,수입1200증가.
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s2.name, s2.money);

		System.out.printf("%s 지하철은 승객이 %d명이고, 수입이 %d원 입니다. \n", t2.trainNo, t2.passengerCnt, t2.income);

		Student s3 = new Student("edward", 20000);
		Taxi taxi1 = new Taxi("잘나간다운수", 0);
		
		s3.takeTaxi(taxi1);
		s1.takeTaxi(taxi1);
		//세번째 학생이. 택시를 탄다.
		//세번째 학생 :나의 돈이 10000빠짐
		//택시 :수입10000증가.
		System.out.printf 
		("%s가 가지고 있는 돈 ==> %d \n", 
				s3.name, s3.money);

		taxi1.showInfo();}
}