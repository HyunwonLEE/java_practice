package softeer;

import java.util.ArrayList;
import java.util.Scanner;

public class 장애물인식프로그램_Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[][] arr = new String[N][N];
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			arr[i] = str.split("");

		}
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println(arr[i][j]);
			}

		}

		System.out.println("end");
		
	}

}
