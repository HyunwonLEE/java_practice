package programmers_weekly;

class Solution_82612 {
	public long solution(int price, int money, int count) {
		long answer = -1;
		long sum_price = 0;
		for (int i = 0; i < count; i++) {
			sum_price += price + (price * i);
		}
		answer = sum_price - money;
		if (answer < 0)
			return 0;

		return answer;
	}
}

public class First_week {

	public static void main(String[] args) {
		Solution_82612 s = new Solution_82612();
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(s.solution(price, money, count));

	}

}
