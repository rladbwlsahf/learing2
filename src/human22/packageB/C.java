package human22.packageB;

import human22.packageA.A;

public class C {
	public static void main(String[] args) {
		A a = new A();
		//다른 PKG,다른 클래스
		a.method1();
		//public 이므로 다른PKG, 다른 클래스라도 접근 가능
		//단,import 조건하에만
		a.method2();
		//defult이므로 다른 PKG에서 접근 불가
		//어떤 조건이든 접근 불가
		a.method3();
		//private 이므로 다른 클래스에서 접근 불가.
	}

}
