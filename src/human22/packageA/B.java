package human22.packageA;

public class B {
	public static void main() {
		A a = new A();
		//동일 PKG,다른클래스
		a.method1();
		//public 이므로 접근 가능
		a.method2();
		//default 이나 동일 PKG이기 떄문에 다른 클래스 접근 가능
		a.method3();
		//private이기 때문에 다른 클래스는 어떤 경우든 접근 불가
	}
}
