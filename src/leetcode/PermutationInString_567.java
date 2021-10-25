package leetcode;

public class PermutationInString_567 {

	public static boolean result = false;

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(checkInclusion(s1, s2));

	}

	public static boolean checkInclusion(String s1, String s2) {

		permutation(s1, "", s2);
		return result;

	}

	static void permutation(String str, String prefix, String s2) {
		int n = str.length();

		if (n == 0) {
			// System.out.println(prefix);

			if (s2.indexOf(prefix) >= 0) {
				result = true;
			}
		} else {
			for (int i = 0; i < n; i++) {
				permutation(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), s2);
			}
		}

	}

}
