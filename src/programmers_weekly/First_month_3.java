package programmers_weekly;



public class First_month_3 {

	public static void main(String[] args) {
		int a = 90;
		int b = 500;

		int[] g = { 70, 70, 0 };
		int[] s = { 0, 0, 500 };
		int[] w = { 100, 100, 2 };
		int[] t = { 4, 8, 1 };
		
		System.out.println(solution(a, b, g, s, w, t));

	}

	static long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
		long answer = -1;
		long[] result = new long[2];
		int[] time = new int[w.length];
		for(int i = 0; i < w.length; i ++) {
			time[i] = w[i] * t[i];
		}		
		while (a > 0) {
			
			
		}
		
		
		return answer;
	}

}
