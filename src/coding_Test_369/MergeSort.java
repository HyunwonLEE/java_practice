package coding_Test_369;

import java.util.ArrayList;

public class MergeSort {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> testData = new ArrayList<Integer>();
		
		for(int index = 0; index < 100; index++) {
			testData.add((int)(Math.random() * 100 ));
		}
		MergeList mSort = new MergeList();
		mSort.mergeSplitFunc(testData);

	}

}

class MergeList {

	public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
		ArrayList<Integer> mergedList = new ArrayList<Integer>();

		int leftPoint = 0;
		int rightPoint = 0;

		// case 1: left/right 둘 다 있을때,
		while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
			if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
				mergedList.add(rightList.get(rightPoint));
				rightPoint++;
			} else {
				mergedList.add(leftList.get(leftPoint));
				leftPoint++;
			}
		}
		// case 2 : right 데이터가 없을 때
		while (leftList.size() > leftPoint) {
			mergedList.add(leftList.get(leftPoint));
			leftPoint++;
		}

		// case 3 : left 데이터가 없을 때
		while (rightList.size() > rightPoint) {
			mergedList.add(rightList.get(rightPoint));
			rightPoint++;
		}

		return mergedList;
	}

	public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {
		if (dataList.size() <= 1) {
			return dataList;
		}
		int medium = dataList.size() / 2;

		ArrayList<Integer> leftArr = new ArrayList<Integer>();
		ArrayList<Integer> rightArr = new ArrayList<Integer>();

		leftArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium)));
		rightArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));

		return this.mergeFunc(leftArr, rightArr);
	}
}