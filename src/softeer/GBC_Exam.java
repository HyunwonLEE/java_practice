package softeer;

import java.util.ArrayList;
import java.util.Scanner;

public class GBC_Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		ArrayList<int[]> list = new ArrayList<int[]>();

		for (int i = 0; i < N; i++) {
			int[] arr = new int[2];
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			list.add(arr);
		}
		ArrayList<int[]> list1 = new ArrayList<int[]>();

		for (int i = 0; i < M; i++) {
			int[] arr1 = new int[2];
			arr1[0] = sc.nextInt();
			arr1[1] = sc.nextInt();
			list1.add(arr1);
		}
		int max = 0;
		int first = 0;
		int second = 0;
		
		while (list.size() > 0 && list1.size() > 0) {
			int temp = 0;
			first = list.get(0)[0];
			second = list1.get(0)[0];

			if (list.get(0)[1] < list1.get(0)[1]) {
				temp = list1.get(0)[1] - list.get(0)[1];
				if(max < temp) {
					max = temp;
				}
				
			}
			if (first < second) {
				list1.get(0)[0] = second - first;
				first = 0;
				list.remove(0);
			} else if (first > second) {
				list.get(0)[0] = first - second;
				second = 0;
				list1.remove(0);
			} else {				
				list.remove(0);
				list1.remove(0);
				first = 0;
				second = 0;
			}

		}
		System.out.println(max);

	}

}
