package self_study;

public class Day01 {

	public static void main(String[] args) {

		int[] temperature = {3,2,1,5,4,3,3,2};
		int temperature_len = 8;
		int A = 1;
		int B = 6;
		int A_temperature = temperature[A-1];
		int B_temperature = temperature[B-1];
		int result = 0;
		
		for(int i = A-1; i < B-1; i++ ) {
			if(A_temperature < temperature[i] && B_temperature < temperature[i]) {
				result++;
			}
		}
		System.out.println(result);
	}

}
