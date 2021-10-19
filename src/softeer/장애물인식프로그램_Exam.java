package softeer;

import java.util.Scanner;

public class 장애물인식프로그램_Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j) - 48;
			}
			
		}
		
		System.out.println("end");
	}

}
