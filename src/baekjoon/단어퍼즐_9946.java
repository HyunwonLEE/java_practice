package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ¥‹æÓ∆€¡Ò_9946 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		while (true) {
			String first = br.readLine();
			String second = br.readLine();
			cnt++;
			if (first.equals("END") && second.equals("END"))
				break;

			if (first.length() == second.length()) {
				char[] firstarr = first.toCharArray();
				char[] secondarr = second.toCharArray();
				Arrays.sort(firstarr);
				Arrays.sort(secondarr);

				if (String.valueOf(firstarr).equals(String.valueOf(secondarr))) {
					sb.append("Case ").append(cnt).append(": same").append('\n');
					continue;
				}
			}

			sb.append("Case ").append(cnt).append(": different").append('\n');
		}
		
		System.out.println(sb.toString());
	}

}
//Case4: different
//Case 4: different
//Case 2: different