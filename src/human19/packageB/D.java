package human19.packageB;

import human19.packageA.B;

public class D {
	//public 클래스는 어디서나 접근 가능
	A a = new A();
	//A는 default 이면서 다른 PKG이므로 접근 불가.
	B b = new B();
	//B는 다른 PKG이지만 public 이므로 B는 import를 활용하여 접근 가능
	//or human19.packageB~ 패키지앞에 적기
	C c = new C();
	//C는 동일 PKG이므로 접근 가능
	D d = new D();
	//D는 자기 자신이므로 접근 가능
	
}
