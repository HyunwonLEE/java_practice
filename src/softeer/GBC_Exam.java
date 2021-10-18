package softeer;

import java.util.ArrayList;
import java.util.Scanner;

public class GBC_Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		for(int i = 0; i < N; i++) {
			int[] arr = new int[2];
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			list.add(arr);
		}
		ArrayList<int[]> list1 = new ArrayList<int[]>();
		
		for(int i = 0; i < M; i++) {
			int[] arr1 = new int[2];
			arr1[0] = sc.nextInt();
			arr1[1] = sc.nextInt();
			list1.add(arr1);
		}
		int index = 0;
		int max = 0;
		while (list.size() > 0 && list1.size() > 0) {
			
			list.get(index)[0] = list.get(index)[0] - list1.get(index)[0];
			list1.get(index)[0] = list1.get(index)[0] - list.get(index)[0];
			if(list.get(index)[1] - list1.get(index)[1] > max) {
				max = list.get(index)[1] - list1.get(index)[1];
			}
			if(list.get(index)[0] < 0) {
				list.remove(index);
				
			}
			if(list1.get(index)[0] < 0) {
				list1.remove(index);
				
			}
				
		}
		System.out.println(max);
		
		
		
	}

}
