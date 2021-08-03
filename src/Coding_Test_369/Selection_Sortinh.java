package Coding_Test_369;

import java.util.ArrayList;
import java.util.Collections;

public class Selection_Sortinh {

	public static void main(String[] args) {
		ArrayList<Integer> dataList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			dataList.add((int) (Math.random() * 100));
		}
		SelectionSort ss = new SelectionSort();
		ss.sort(dataList);

		for (Integer integer : dataList) {
			System.out.println(integer);
		}
	}

}

class SelectionSort {
	public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
		for(int index = 0; index < dataList.size()-1; index++) {
			int min = dataList.get(index);
			int min_index = index;
			boolean swap = false;
			for(int index2 = index + 1; index2 < dataList.size(); index2++) {
				if(min > dataList.get(index2)) {
					min = dataList.get(index2);
					min_index = index2;
					swap = true;
				}				
				
			}
			if(swap) Collections.swap(dataList, index, min_index);
		}

		return dataList;
	}
}