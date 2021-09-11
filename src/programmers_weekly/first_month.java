package programmers_weekly;

public class first_month {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };

		int answer = 0;
		int[] cnt = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			cnt[numbers[i]]++;
		}
		for(int i = 0; i< cnt.length; i++) {
			if(cnt[i] == 0) {
				answer += i;
			}
		}

	}

}
