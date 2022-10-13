package human28;

public class MyTv {
	boolean isPowerOn;
	int		channel;
	int		volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	void turnOnOff() {
		//켜다,꺼짐 스위치
//		boolean isPowerOn = true;
//		if(isPowerOn == true) {
//			isPowerOn = fasle;
//		}
//		else {
//			isPowerOn = true;
//		}
		this.isPowerOn = ! this.isPowerOn; // !=반대
		//boolean 형태는 true/false 2가지만 있기 때문에 NOT의 연산자를 처리할수 있다.
	}
	void volumeUp() {
		//볼륨 1 증가,단 MaxVolume 내에서만
		if (this.volume<MAX_VOLUME) {
			this.volume = this.volume + 1;
		}
	}

	void volumeDown() {
		if (this.volume > MIN_VOLUME ) {
		this.volume = this.volume - 1; // this.volume--
	}
}
	void channelUp() {
		//채널 1 증가 . MaxChannel내에서만
		//MAX_CHANNEL에서 1증가할 경우에는 Min_CHANNEL로 변경
		if(this.channel==MAX_CHANNEL) {
			this.channel = MIN_CHANNEL;
		}else {
			this.channel++;	
		}

	}
	void channelDown() {
		//채널 1 감소 . MaxChannel내에서만
		//Min_CHANNEL에서 1증가할 경우에는 MAX_CHANNEL로 변경
		if(this.channel==MIN_CHANNEL) {
			this.channel = MAX_CHANNEL;
		}else {
			this.channel--;	
		}
	}
}
