package softeer;


import java.util.Scanner;

public class 지도자동구축_Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int init = 4;
		int N = sc.nextInt();
		int bottom = (int) Math.sqrt(init);		
		for(int i = 1; i <= N; i++) {
			bottom = bottom + (bottom - 1);
			
		}
		
		int result = (int) Math.pow(bottom, 2);
		
		
		

		System.out.println(result);
	}

}

// 0 : 4. 1: 9, 2: 25


// 2 3 5 9 