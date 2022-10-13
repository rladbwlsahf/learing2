package human13;

public class Car {
	public static int maxSpeed;
	public int currentSpeed;
	
	public void speedUp() {
		this.currentSpeed ++;
		this.maxSpeed ++;
		//정적 필드 maxSpeed는 클래스명으로 접근하는것을 권장하나
		//객체 차원(this=car1)으로 접근 가능하다.
		
		System.out.printf("currentSpeed : %d \n", 
				this.currentSpeed);
		System.out.printf("maxSpeed : %d \n", 
				this.maxSpeed);
		System.out.printf("maxSpeed : %d \n", 
				Car.maxSpeed);
		
	}
	static {
		Car.maxSpeed = 300;
		//static으로 정의된 블럭은 우선 실행되면서 static변수를
		//초기화 한다.
		
//		this.currentSpeed = 100;
		//사용불가
		//객체로 접근할 일반 변수는 static에서 사용불가.
//		this.speedUp();
		//사용불가
		//객체로 접근할 일반 메서드는 static에서 사용불가.
	}
	public static void driving() {
//		this.speedUp();
		//사용불가
		//객체가 사용되지않았기 때문에.
		Car car1 = new Car();
		car1.speedUp();
		//static 메서드 내에서 일반 메서드를 호출할려면.
		//객체를 생성하고,객체 기반에서 호출 가능함.
		
//		Car.maxSpeed = 250; //maxSpeed하게되면 250으로 부터 증가
	}

}
