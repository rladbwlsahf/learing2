package human10;

public class Student {
	public String name;		//나의 이름
	public int money;		//내가 가진돈

	public Student(String name,int money) {
		this.name = name;
		this.money = money;
	}
	public void takeBus(Bus b) {		//학생이 버스를 타는 행동
		if(this.money>1000) {
			this.money = this.money - 1000;	//money가 빠져나감
			b.take(1000);					//버스는 1000원 증가
		}
		else {
			System.out.printf 
			("%s학생의 돈은 %d이므로 사용불가합니다.\n"
					,this.name, this.money);
		}
	}
	public void takeTrain (Train t) {	//학생이 지하철 타는 행동
		if(this.money>1200) {
		this.money = this.money - 1200;	//money가 빠져나감
		t.take(1200);}					//지하철은 1200원 증가
	else {
		System.out.printf("s% 학생의 돈은 %d 이므로 사용불가합니다.\n", this.name, this.money);
	}
}

public void takeTaxi(Taxi t) {
	// t라는 것은 지역변수이고, tackTaxi 메서드 내에서만
	// 사용가능한 Taxi 클래스의 인스턴스 변수이다.
	if (this.money > 10000) {
		this.money = this.money - 10000;
		t.take(10000);
	} else {
		System.out.printf("%s학생의 돈은 %d이므로 사용불가합니다.\n", this.name, this.money);

	}
}

}
	
	
	
