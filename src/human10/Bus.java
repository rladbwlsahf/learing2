package human10;

public class Bus {
	public String busNo;		//버스 번호
	public int passengerCnt;	//승객 수
	public int income;			//버스 수입
	
	public Bus(String busNo,int passengerCnt,int income){
		this.busNo = busNo;
		this.passengerCnt = passengerCnt;
		this.income = income;
	}
	public void take(int money) {
		this.passengerCnt++;
		this.income = this.income + money;
		
		
	}
}
