package coding_Test_369;


public class BruteForce_05 {
	static FastReader scan = new FastReader();
	static StringBuilder sb = new StringBuilder();

	static void input() {
		N = scan.nextInt();
		nums = new int[N + 1];
		operators = new int[5];
		order = new int[N + 1];
		for (int i = 1; i <= N; i++)
			nums[i] = scan.nextInt();
		for (int i = 1; i <= 4; i++)
			operators[i] = scan.nextInt();

		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
	}

	static int N, max, min;
	static int[] nums, operators, order;

	// 피연산자 2개와 연산자가 주어졌을 때 계산해주는 함수
	static int calculator(int operand1, int operator, int operand2) {
		int rst = 0;
		switch(operator) {
		case 1:
			rst = operand1 + operand2;
			break;
		case 2:
			rst = operand1 - operand2;
			break;
		case 3:
			rst = operand1 * operand2;
			break;			
		case 4:
			rst = operand1 / operand2;
			break;
			
		}
		return rst;
		
	}

	static void rec_func(int k, int value) {
		if (k == N) {
			// 완성된 식에 맞게 계산을 해서 정답을 갱신하는 작업
			max = Math.max(max, value);
			min = Math.min(min, value);
		} else {
			// k번째 연산자는 무엇을 선택할 것인가?
			for(int cand = 1; cand <=4; cand++) {
				if(operators[cand] >= 1) {
					operators[cand]--;
					rec_func(k+1, calculator(value,cand,nums[k+1]));
					operators[cand]++;
					
				}
			}
		}
	}

	public static void main(String[] args) {

		input();

		rec_func(1, nums[1]);
		sb.append(max).append('\n').append(min);
		System.out.println(sb.toString());

	}

}
