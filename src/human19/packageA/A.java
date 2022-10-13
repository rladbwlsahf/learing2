package human19.packageA;

import human19.packageB.D;

class A {
	//default 클래스는 동일 Package에서만 접근 가능
	A a = new A();
	//A는 default 클래스는 나 자신이므로 default 라도 접근 가능
	B b = new B();
	//B는 public 이므로, 그리고 동일 Package 이므로 접근 가능
	C c = new C();
	//C는 default이면서 다른 PKG이므로 접근 불가.
	//	human19.packageB.D d = new D();
	D d =new D();
	//D는 Package 명을 붙여서 접근하거나
	//D는 import를 활용하여 접근가능.
}