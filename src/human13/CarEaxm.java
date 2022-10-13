package human13;

public class CarEaxm {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.speedUp();
		
		Car.driving();

		car1.driving();
		//static 메서드인 driving은 객체 기반으로도 접근가능.
		//권장하지 않는다.
		
		int sp;
		
		sp = Car.maxSpeed; //문제X
		sp = car1.maxSpeed;
		// static 벼누인 maxSpeed는 클래스를 통해서 접근하는 것을
		// 권장하나. 객체를 통해서 접근하는 것도 가능하다.
	}

}
