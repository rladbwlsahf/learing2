package human90;

public class Car {

	private int currentSpeed;
	private int maxSpeed;
	
	public Car (int currentSpeed,int maxSpeed) {
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
	}
	public int getCurrentSpeed() {
		return this.currentSpeed;
		
	}
	public void setCruuentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public void SpeedUp(int speed) {
		if(this.currentSpeed + speed <= this.maxSpeed) {
		   this.currentSpeed = this.currentSpeed;
	}
	else {
		this.currentSpeed = this.maxSpeed;
	}
}
	
	
}
