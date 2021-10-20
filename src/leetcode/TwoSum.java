package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 4 };
		int target = 6;
		int temp = target;
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(i, nums[i]);
		}
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

		for (int i = 0; i < map.size(); i++) {
			temp = temp - map.get(i);
			list.add(i);
			if (map.containsValue(temp)) {
				for (Entry<Integer, Integer> entry : entrySet) {
					if (entry.getValue() == temp && entry.getKey() != i) {
						list.add(entry.getKey());
						break;
					}
				}

			}
			if (list.size() == 2)
				break;
			temp = target;
			list.removeAll(list);
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
			System.out.println(result[i]);
		}

	}

}
