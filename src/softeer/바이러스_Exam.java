package softeer;

import java.util.Scanner;

public class 바이러스_Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int P = sc.nextInt();
		int N = sc.nextInt();

		long result = 1;

		for (int i = 0; i < N; i++) {
			result = (result * P) % 1000000007;
		}

		result = (result * K) % 1000000007;

		System.out.println(result);		
		
	}

}

//2147483647
//100000000
//1000000007