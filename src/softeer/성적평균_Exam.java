package softeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ¼ºÀûÆò±Õ_Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int students = sc.nextInt();
		int count = sc.nextInt();
		String[] result = new String[count];
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < students; i++) {
			list.add(sc.nextInt());
		}

		for (int i = 0; i < count; i++) {
			List<Integer> arr = list.subList(sc.nextInt() - 1, sc.nextInt());
			int sum = arr.stream().mapToInt(Integer::intValue).sum();
			
			result[i] = String.format("%.2f", (double)sum/arr.size());
			
		}
		
		for (String str : result) {
			System.out.println(str);
		}
	}
	


}
