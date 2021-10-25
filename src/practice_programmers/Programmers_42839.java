package practice_programmers;

import java.util.ArrayList;
import java.util.HashSet;

class Programmers_42839 {
	static StringBuilder sb = new StringBuilder();
	static ArrayList<Integer> list = new ArrayList<>();
	static int[] arr, selected;
	static int index, answer = 0;
	static HashSet<Integer> set = new HashSet<>();

	public static void main(String[] args) {

		String numbers = "000999";
		solution(numbers);

	}

	public static int solution(String numbers) {

		arr = new int[numbers.length() + 1];
		selected = new int[numbers.length() + 1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = numbers.charAt(i - 1) - 48;
		}
		rec_func(1);

		for (Integer integer : set) {
			boolean rst = true;
			for (int i = 2; i * i <= integer; i++) {
				if (integer % i == 0)
					rst = false;
			}
			if (rst && integer > 1)
				answer++;
		}

		System.out.println(answer);
		return answer;
	}

	static void rec_func(int k) {
		if (k == arr.length) {
			for (int i = 0; i < list.size(); i++) {
				sb.append(list.get(i));
			}

			int value = sb.toString().isEmpty() ? 0 : Integer.parseInt(sb.toString());
			set.add(value);

			sb.delete(0, sb.length());
			list.remove(0);

		} else {
			
			for (int i = 1; i < arr.length; i++) {
				if (index != i || list.size() == 0) {
					list.add(arr[i]);					
				}
				index = i;
				rec_func(k + 1);

			}

		}

	}

}
