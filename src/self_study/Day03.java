package self_study;

class Solution_day_02 {

	public int solution(int num) {
		int answer = 0;
		long lnum = num;
		while (lnum > 1 && answer < 500) {
			if (lnum % 2 == 0) {				
				lnum = lnum / 2;
			} else {				
				lnum = lnum * 3 + 1;
			}
			answer++;
		}
		if(answer > 499) answer = -1;
		return answer;
	}
}

public class Day03 {

	public static void main(String[] args) {

		Solution_day_02 s = new Solution_day_02();

		int num = 6;
		int res = s.solution(num);
		System.out.println(res);

		num = 16;
		res = s.solution(num);
		System.out.println(res);

		num = 626331;
		res = s.solution(num);
		System.out.println(res);

		num = 3630999;
		res = s.solution(num);
		System.out.println(res);
	}

}
