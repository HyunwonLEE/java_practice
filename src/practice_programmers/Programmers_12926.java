package practice_programmers;

class Solution_12926 {
	public String solution(String s, int n) {
		String answer = "";
		String[] a = s.split("");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < n; j++) {
				if (a[i].equals(" "))
					continue;
				if (a[i].equals("z")) {
					a[i] = "a";
				} else if (a[i].equals("Z")) {
					a[i] = "A";
				} else {
					char b = a[i].charAt(0);
					b++;
					a[i] = String.valueOf(b);

				}
			}

		}

		for (String string : a) {
			answer += string;
		}
		return answer;
	}
}

public class Programmers_12926 {

	public static void main(String[] args) {

		String s = "a B z";
		int n = 4;
		Solution_12926 solution = new Solution_12926();

		System.out.println(solution.solution(s, n));

	}

}
