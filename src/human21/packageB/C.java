package human21.packageB;

import human21.packageA.A;

public class C {
	public static void main[String args] {
			A a = new A();
			a.field1 = 10;
			//field1은 public 이므로 다른 PKG,다른 클래스 접근 가능(단,import필요)
			a.fild 2 = 20;
			//field2는 default 이므로 해결 안됨
			a.field3 = 30;
			//field 3은 private라 접근 불가
					
	}
}
