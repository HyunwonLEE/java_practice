package baekjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 배열합치기_11728 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] larr = new int[N];
		int[] rarr = new int[M];
		
		for(int i = 0; i < larr.length; i++) {
			larr[i] = sc.nextInt();
		}
		for(int i = 0; i < rarr.length; i++) {
			rarr[i] = sc.nextInt();
		}
		
		int[] arr = new int[M + N];
		
		Arrays.sort(larr);
		Arrays.sort(rarr);
		
		System.arraycopy(larr, 0, arr, 0, larr.length);
		System.arraycopy(rarr, 0, arr, larr.length, rarr.length);
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(' ');
		}
		System.out.println(sb.toString());
 
	}

}
