package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ∞≈∫œ¿Ã_2959 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] arr = br.readLine().split(" ");
		int[] iarr = new int[4];
		for(int i = 0; i < arr.length; i++) {
			iarr[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(iarr);
		
		System.out.println(iarr[0] * iarr[2]);
	}

}
