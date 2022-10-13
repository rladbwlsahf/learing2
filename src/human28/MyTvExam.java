package human28;

public class MyTvExam {

	public static void main(String[] args) {

		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume =15;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

		t.channel = 35;
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

		t.channel = 50;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}
}

