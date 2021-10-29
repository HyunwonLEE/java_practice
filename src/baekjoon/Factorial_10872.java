package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Factorial_10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		
		
		bw.write(Factorial(N) + "\n");
		bw.flush();
	}
	
	public static int Factorial(int N) {
		if(N <= 1) {
			return 1;
		}
		
		return N * Factorial(N-1);
	}
	

}
