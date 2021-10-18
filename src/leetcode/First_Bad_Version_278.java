package leetcode;

public class First_Bad_Version_278 {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(2126753390));
	}

	public static int firstBadVersion(int n) {
		long start = 0;
		long end = n;
		long mid = n / 2;
		while (start != end) {

			if (isBadVersion((int)mid)) {
				end = mid;
				mid = (end + start) / 2;
			} else {
				start = mid;
				mid = (start + end) / 2;
			}
			if (mid <= start)
				return  (int)(end);

		}
		return (int)start;
	}

	private static boolean isBadVersion(int mid) {
		int bad = 1702766719;
		if (mid >= bad)
			return true;
		return false;
	}

}
