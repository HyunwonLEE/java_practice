package Coding_Test_369;

import java.util.ArrayList;
import java.util.Collections;

public class Insetion_Sort {

	public static void main(String[] args) {
		ArrayList<Integer> dataList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			dataList.add((int) (Math.random() * 100));
		}
		InsertionSort is = new InsertionSort();
		is.sort(dataList);

		for (Integer integer : dataList) {
			System.out.println(integer);
		}
	}

}

class InsertionSort {
	public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
		for (int index = 0; index < dataList.size() - 1; index++) {
			for (int index2 = index + 1; index2 > 0; index2--) {
				if (dataList.get(index2) < dataList.get(index2-1)) {
					Collections.swap(dataList, index2, index2-1);
				}else {
					break;
				}
			}


		} 

		return dataList;
	}
}