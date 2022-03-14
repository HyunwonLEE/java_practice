package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 두수의합_3273 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(str[i]));
		}
		Collections.sort(list);

		int X = Integer.parseInt(br.readLine());
		int count = 0;
		while (list.size() > 1) {
			int temp = X;
			temp -= list.remove(0);

			if (binarySearch(list, 0, list.size(), temp) > 0) {
				count++;				
			}

		}
		System.out.println(count);

	}

	private static int binarySearch(ArrayList<Integer> list, int fromIndex, int toIndex, int key) {
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = list.get(mid);

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}

}




