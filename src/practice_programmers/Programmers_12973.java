package practice_programmers;

public class Programmers_12973 {

	public static void main(String[] args) {

		String s = "zzzz";
		int a = solution(s);
		System.out.println(a);
	}

	static public int solution(String s) {
		int answer = -1;
		char ch = 'a';

		for (int i = 0; i < 26; i++) {
			String str = ch + "" + ch;
			String origin = s;
			if (s.length() == 0) return 1;
			s = s.replaceAll(str, "");
			if(!s.equals(origin)) {
				i = 0;
				ch = 'a';
				continue;
			}
			ch++;

		}
		answer = s.length() == 0 ? 1 : 0;

		return answer;
	}

}
