package softeer;

import java.util.Scanner;

public class 스마트물류_Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int start = sc.nextInt();
		String[] str = sc.next().split("");
		int cnt = 0;

		for (int i = 0; i < total; i++) {
			if (str[i].equals("P")) {
				for (int j = i - start; j < i; j++) {
					if(j < 0) continue;
					if (str[j].equals("H")) {
						str[j] = "X";
						str[i] = "X";
						cnt++;
						break;
					}
				}
				if (str[i].equals("X"))
					continue;
				for (int j = i + 1; j <= i + start && j < total; j++) {
					if (str[j].equals("H")) {
						str[j] = "X";
						str[i] = "X";
						cnt++;
						break;
					}
				}

			}
		}

		System.out.println(cnt);
	}

}

