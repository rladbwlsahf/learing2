package human24;

public class Car {
	private int currentSpeed;
	private int maxSpeed;
	
	public Car(int currentSpeed, int maxSpeed) {
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
		return this.maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void speedUp(int speed) {
		if (this.currentSpeed + speed <= this.maxSpeed) {
			this.currentSpeed = this.currentSpeed;
		}
		else {
			this.currentSpeed = this.maxSpeed;
		}
	}
}