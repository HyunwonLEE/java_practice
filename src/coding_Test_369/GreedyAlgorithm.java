package coding_Test_369;

import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithm {

	public static void main(String[] args) {
		GreedyAlgorithm gObject = new GreedyAlgorithm();
		Integer[][] objectList = { {10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5} };
		gObject.knapsackFunc(objectList, 30.0);
	}

	public void knapsackFunc(Integer[][] objectList, double capacity) {
		double totalValue = 0.0;
		double fraction = 0.0;
		
		Arrays.sort(objectList, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] objectItem1, Integer[] ObjectItem2) {
				return (ObjectItem2[1] / ObjectItem2[0]) - (objectItem1[1] / objectItem1[0]);
			}
		});
		
		for(int index = 0; index < objectList.length; index++) {
			if (capacity - (double)objectList[index][0] > 0) {
				capacity -= (double)objectList[index][0];
				totalValue += (double) objectList[index][1];
				System.out.println("����:" + objectList[index][0] + ", ��ġ:" + objectList[index][1]);				
			} else {
				fraction = capacity / (double)objectList[index][0];
				totalValue += (double)objectList[index][1] * fraction;
				System.out.println("����:" + objectList[index][0] + ", ��ġ:" + objectList[index][1] + ", ����:" + fraction); 
				break;
			}
			
		}
		System.out.println("�� ���� �� �ִ� ��ġ:" + totalValue);
	}

}
