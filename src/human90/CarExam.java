package human90;

public class CarExam {

	public static void main(String[] args) {

		Car car1 = new Car (220,250);
		System.out.printf
		("현재 속도 : %d / 최고 속도 %d \n"
				,car1.getCurrentSpeed(),car1.getMaxSpeed());
		
		//getter통해서 데이터 가져오기
		
		car1.setMaxSpeed(249);
		System.out.printf
		("현재 속도 : %d / 최고 속도 %d \n"
				,car1.getCurrentSpeed(),car1.getMaxSpeed());
		
		car1.SpeedUp(10);
		System.out.printf
		("현재 속도 : %d / 최고 속도 %d \n"
				,car1.getCurrentSpeed(),car1.getMaxSpeed());
		car1.SpeedUp(50);
		System.out.printf
		("현재 속도 : %d / 최고 속도 %d \n"
				,car1.getCurrentSpeed(),car1.getMaxSpeed());
	}

}
