package human09;

public class MyPointExam01 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
	
		double distance = p.getDistance(2, 2);
	
		System.out.printf(
		"2점 사이의 거리는 = %f \n", distance);
		
	}
	
}

