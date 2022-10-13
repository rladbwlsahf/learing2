package human03;

public class CarExam01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		System.out.println("car1 = > "+ car1);
		System.out.println("this.company = > "+ car1.company);
		System.out.println("this.model = > "+ car1.model);
		System.out.println("this.maxSpeed = > "+ car1.maxSpeed);
		System.out.println("this.currentSpeed = > "+ car1.currentSpeed);
		
		Car car2 = new Car();
		System.out.println("car2 = > "+ car2);
		System.out.println("this.company = > "+ car2.company);
		System.out.println("this.model = > "+ car2.model);
		System.out.println("this.maxSpeed = > "+ car2.maxSpeed);
		System.out.println("this.currentSpeed = > "+ car2.currentSpeed);
		
		Car car3 = new Car("현대자동차", "그랜져", 250);
		System.out.println("car3 = > "+ car3);
		System.out.println("this.company = > "+ car3.company);
		System.out.println("this.model = > "+ car3.model);
		System.out.println("this.maxSpeed = > "+ car3.maxSpeed);
		System.out.println("this.currentSpeed = > "+ car3.currentSpeed);

	}

}
