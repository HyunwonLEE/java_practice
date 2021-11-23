package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class 콘테스트_5576 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		PriorityQueue<Integer> Wqueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> kqueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < 10; i++) {
			Wqueue.add(Integer.parseInt(br.readLine()));
		}
		for (int i = 0; i < 10; i++) {
			kqueue.add(Integer.parseInt(br.readLine()));
		}
		
		int Wsum = 0;
		int Ksum = 0;
		for(int i = 0; i < 3; i++) {
			Wsum += Wqueue.poll();
			Ksum += kqueue.poll();
		}
		
		
		
		sb.append(Wsum).append(' ').append(Ksum);
		System.out.println(sb.toString());

	}

}
