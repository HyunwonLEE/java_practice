package practice_programmers;

class Solution_12921 {
	public int solution(long n) {
		int answer = 0;
		int[] array = new int[(int) (n + 1)];
		for (int i = 2; i <= n; i++) {
			array[i] = i;

		}
		for (int i = 2; i <= n; i++) {
			if(array[i] == 0) continue;
			for (int j = i + i; j <= n; j += i) {							
				array[j] = 0;
			}

		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0) answer++;
		}

		return answer;
	}

}

public class Programmers_12921 {

	public static void main(String[] args) {

		long n = 10l;
		Solution_12921 s = new Solution_12921();
		int a = s.solution(n);
		System.out.println(a);

	}

}
