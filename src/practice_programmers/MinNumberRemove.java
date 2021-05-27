package practice_programmers;

public class MinNumberRemove {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int len = arr.length == 1 ? arr.length : arr.length - 1;
		int[] answer = new int[len];
		if (len == 1) {
			answer[0] = -1;

		}
		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < temp) {
				temp = arr[i];
			}
		}
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != temp) {
				answer[a] = arr[i];
				a++;
			} 
		}
		for (int i : answer) {
			System.out.println(i);
		}

	}

}
