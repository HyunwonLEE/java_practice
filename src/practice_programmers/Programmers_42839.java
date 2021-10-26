package practice_programmers;

import java.util.ArrayList;
import java.util.HashSet;

class Programmers_42839 {
	static StringBuilder sb = new StringBuilder();
	static ArrayList<Integer> list = new ArrayList<>();
	static int[] arr, selected;
	static int index, answer = 0;
	static boolean[] check = new boolean[10];
	static HashSet<Integer> set = new HashSet<>();

	public static void main(String[] args) {

		String numbers = "17";
		solution(numbers);

	}

	public static int solution(String numbers) {

		arr = new int[numbers.length() + 1];
		selected = new int[numbers.length() + 1];
		
		for (int i = 0; i < numbers.length(); i++) {

			rec_func(numbers, sb, i + 1);
		}

		for (Integer integer : set) {
			boolean rst = true;
			for (int i = 2; i * i <= integer; i++) {
				if (integer % i == 0) {
					rst = false;
					break;
				}

			}
			if (rst && integer > 1)
				answer++;
		}

		System.out.println(answer);
		return answer;
	}

	static void rec_func(String numbers, StringBuilder sb, int m) {
		if (sb.length() == m) {
			int num = Integer.parseInt(sb.toString());
			set.add(num);
			return;

		} else {

			for (int i = 0; i < numbers.length(); i++) {
				if(!check[i]) {
					check[i] = true;
					sb.append(numbers.charAt(i));
					rec_func(numbers, sb, m);
					check[i] = false;
					sb.delete(sb.length()-1, sb.length());
					
				}
				
			}

		}

	}

}
