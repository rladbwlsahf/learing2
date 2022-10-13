package human25;

public class GetMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {5,4,9,10,37};
		int max = getMax(array1);
		System.out.printf("Max = %d \n", max);
		
		int[] array2 = {1,4,9,19,3,7};
		max = -99;
		System.out.printf("Max = %d \n", max);
	}
		private static int getMax(int[]array) {
			int max = -99;
			
			for (int a=0; a<array.length; a++) {
				if(max < array[a]) {
					max = array[a];
				}
			}
			return max;
		}

}
