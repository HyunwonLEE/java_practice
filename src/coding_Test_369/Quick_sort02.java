package coding_Test_369;

import java.util.ArrayList;
import java.util.Arrays;

public class Quick_sort02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> testData = new ArrayList<Integer>();

		for (int index = 0; index < 100; index++) {
		    testData.add((int)(Math.random() * 100));
		}

		QuickSort02 qSort = new QuickSort02();
		System.out.println(qSort.sort(testData));
		
		System.out.println(testData);
	
	}

}

class QuickSort02 {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }
        int pivot = dataList.get(0);
        
        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();        
        
        for (int index = 1; index < dataList.size(); index++) {
            if (dataList.get(index) > pivot) {
                rightArr.add(dataList.get(index));
            } else {
                leftArr.add(dataList.get(index));
            }
        }
        
        ArrayList<Integer> mergedArr = new ArrayList<Integer>();
        mergedArr.addAll(this.sort(leftArr));
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(this.sort(rightArr));
        
        return mergedArr;        
    }
}

class QuickSort01{
	public ArrayList<Integer> sort(ArrayList<Integer> dataList){
		if(dataList.size() <= 1) {
			return dataList;
		}
		
		Integer pivot =  dataList.get(0);
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		
		for(int i = 1; i < dataList.size(); i++) {
			if(dataList.get(i) > pivot) {
				rightList.add(dataList.get(i));
			}else {
				leftList.add(dataList.get(i));
			}
		}
		
		ArrayList<Integer> mergedList = new ArrayList<Integer>();
		
		mergedList.addAll(this.sort(leftList));
		mergedList.addAll(Arrays.asList(pivot));
		mergedList.addAll(this.sort(rightList));
		
		 return mergedList;
	}
}