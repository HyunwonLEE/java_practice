package leetcode;

public class ReverseWords3_557 {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";

		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		String result = "";
		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String[] str = arr[i].split("");
			for (int j = str.length - 1; j >= 0; j--) {
				result += str[j];

			}
			if (i != arr.length-1)
				result += " ";
		}

		return result;
	}
}
