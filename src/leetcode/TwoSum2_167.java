package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class TwoSum2_167 {

	public static void main(String[] args) {
		int[] numbers = { 5,25,75 };
		int target = 100;
		int[] arr = twoSum(numbers, target);

		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (!map.containsKey(numbers[i])) {
				map.put(numbers[i], new ArrayList<Integer>());

			}
			map.get(numbers[i]).add(i);

		}

		ArrayList<Integer> list = new ArrayList<>();
		
		
		Iterator<Integer> it = map.keySet().iterator();
		for (int i = 0; i < map.size(); i++) {
			int key = it.next();			
			int temp = target - key;
			if (map.containsKey(temp)) {
				if (temp == key && map.get(key).size() > 1) {
					list.add(map.get(key).get(0));
					list.add(map.get(key).get(1));
					break;
				} else {
					list.add(map.get(key).get(0));
					list.add(map.get(temp).get(0));
					break;
				}

			}

		}
		;
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i) + 1;
		}
		Arrays.sort(result);
		return result;
	}
}
