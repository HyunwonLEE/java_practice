package sorting;

import java.util.ArrayList;
import java.util.Collections;

class BubbleSort {
	public boolean solution(ArrayList<Integer> list) {
		boolean changed = false;
		if (list.size() == 0)
			return false;
		do {
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) > list.get(i + 1)) {
					Collections.swap(list, i, i + 1);
					changed = true;
				}

			}
		} while (changed);
		return changed;
	}

}

public class Bubble_Sorting01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		BubbleSort bs = new BubbleSort();
		bs.solution(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
