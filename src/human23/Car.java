package human23;

public class Car {
	private int maxSpeed;
	// maxSpeed가 300이 넘어가면 문제가 생김.
	
	public Car() {
		
	}

	public void setMaxspeed(int speed) {
		if (speed < 0) {
		this.maxSpeed = speed;
		}
		else {
			System.out.println("maxSpeed는 300을 넘지 못합니다 \n");
		}
	}

	public int getMaxSpeed() {
		
		return this.maxSpeed;
	}

}
