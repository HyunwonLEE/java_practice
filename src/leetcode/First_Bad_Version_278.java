package leetcode;

public class First_Bad_Version_278 {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(5));
	}

	public static int firstBadVersion(int n) {
		int start = 0;
		int end = n;
		int mid = n / 2;
		while (start != end) {

			if (isBadVersion(mid)) {
				end = mid;
				mid = end / 2;
			} else {
				start = mid;
				mid = (start + end) / 2;
			}

		}
		return start;
	}

	private static boolean isBadVersion(int mid) {
		int bad = 4;
		if(mid >= bad) return true;
		return false;
	}

}
