package human09;

public class MyPoint {
	public int x;
	public int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int i, int j) {
		double dist;	//소수점이 나오기 때문에 double
		int a, b;		
		a = this.x - i;
		b = this.y - j;

		dist = Math.sqrt(a * a + b * b);	//제곱근 구하는 Math.sqrt
		return dist;

	}
}
