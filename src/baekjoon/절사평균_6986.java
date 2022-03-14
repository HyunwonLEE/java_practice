package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 절사평균_6986 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Double> list = new ArrayList<>();
		double rst1 = 0.00f;
		double rst2 = 0.00f;
		for (int i = 0; i < N; i++) {
			list.add(Double.parseDouble(sc.next()));
		}
		Collections.sort(list);

		for (int i = 0; i < K; i++) {
			list.remove(0);
			list.remove(list.size() - 1);
		}

		for (int i = 0; i < list.size(); i++) {
			rst1 += list.get(i);
			rst2 += list.get(i);
		}

		rst1 = rst1 / list.size();
		rst2 = (rst2 + (list.get(0) * K  + list.get(list.size() - 1) * K)) / N;

		sb.append(String.format("%.2f", rst1)).append('\n').append(String.format("%.2f", rst2));

		System.out.println(sb.toString());

	}

}
