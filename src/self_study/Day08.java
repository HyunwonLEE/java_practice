package self_study;

import java.util.ArrayList;
import java.util.Arrays;

class Solution_08 {

	public boolean checkPrime(int val) {
		boolean isPrime = true;
		for (int i = 2; i < val / 2; i++) {
			if (val % i == 0) {
				isPrime = false;
				break;
			}

		}
		if (val == 1)
			isPrime = false;

		return isPrime;
	}

	public int[] solution(int[] value) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < value.length; i++) {
			if (checkPrime(value[i])) {
				list.add(value[i]);
			}
		}
		int[] result;
		if (list.size() == 0) {
			result = new int[1];
			result[0] = -1;
		}

		else {
			result = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				result[i] = list.get(i);
			}
		}

		return result;
	}
}

public class Day08 {

	public static void main(String[] args) {
		Solution_08 s = new Solution_08();
		int[] result;
		int[] data;

		data = new int[] { 22, 1, 51, 31, 52, 111 };
		result = s.solution(data);
		Integer res[] = Arrays.stream(result).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(res));

		data = new int[] { 13, 71, 17, 55, 23, 101, 36, 27, 44 };
		result = s.solution(data);
		res = Arrays.stream(result).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(res));

		data = new int[] { 12, 22, 10, 56, 36, 27 };
		result = s.solution(data);
		res = Arrays.stream(result).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(res));

	}

}
