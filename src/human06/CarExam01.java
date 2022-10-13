package human06;

public class CarExam01 {

	public static void main(String[] args) {
		Car car1 = new Car("현대","그랜저",250,100);
		Car car2 = new Car("기아","모닝",200,75);

		System.out.println("car1.현재속도 ==> " + car1.currentSpeed);
		System.out.println("car2.현재속도 ==> " + car2.currentSpeed);
		
		System.out.println("----------------------");
		car1.speedUp();
		
		System.out.println("car1.현재속도 ==> " + car1.currentSpeed);
		System.out.println("car2.현재속도 ==> " + car2.currentSpeed);
		car2.speedUp();
		car2.speedUp();
		
		System.out.println("----------------------");
		
		System.out.println("car1.현재속도 ==> " + car1.currentSpeed);
		System.out.println("car2.현재속도 ==> " + car2.currentSpeed);
		
		System.out.println("----------------------");
		
		int car1CurrentSpeed ;
		car1CurrentSpeed = car1.getcurrentSpeed(); //<==호출하였다
		System.out.println ("car1.현재속도 ==> " + car1CurrentSpeed);
		
		int car2CurrentSpeed;
		car2CurrentSpeed = car2.speedDown();
		
		
		System.out.println("car2.현재속도 ==> " + car2CurrentSpeed);
		
		
	}

}
