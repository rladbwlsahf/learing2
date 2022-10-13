package human19.packageB;

import human19.packageA.B;

class C {
	//C는 default이면서 동일 PKG에서만 접근 가능.
	A a = new A();
	//A는 default이면서 다른 PKG이므로 접근 불가
	B b = new B();
	//B는 다른 PKG이지만 public 이므로 B는 import를 활용하여 접근가능.
	C c =new C();
	//C는 자기 자신이므로 접근가능.
	D d = new D();
	//D는 동일 PKG이면서 public이므로 접근 가능.
}
