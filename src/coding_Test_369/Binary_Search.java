package coding_Test_369;

import java.util.ArrayList;
import java.util.Collections;

public class Binary_Search {

	public static void main(String[] args) {
		ArrayList<Integer> testData = new ArrayList<Integer>();

		for (int index = 0; index < 100; index++) {
			testData.add((int) (Math.random() * 100));
		}

		Collections.sort(testData);
		BinarySearch bs = new BinarySearch();

		boolean result = bs.searchFunc(testData, 5);
		System.out.println(result);
	}

}

class BinarySearch {
	public boolean searchFunc(ArrayList<Integer> dataList, int findData) {
		if (dataList.size() == 1 && findData == dataList.get(0)) {
			return true;
		}
		if (dataList.size() == 1 && findData != dataList.get(0)) {
			return false;
		}
		if (dataList.size() == 0) {
			return false;
		}

		int medium = dataList.size() / 2;

		if (dataList.get(medium) == findData) {
			return true;
		} else {
			if (dataList.get(medium) > findData) {
				return this.searchFunc(new ArrayList<Integer>(dataList.subList(0, medium)), findData);
			} else {
				return this.searchFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())), findData);
			}
		}

	}
}