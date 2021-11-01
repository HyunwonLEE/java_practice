package leetcode;

public class RomanToInteger_13 {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(romanToInt(s));
	}

	public static int romanToInt(String s) {
		
		
		
		String[] arr = s.split("");
		int[] iarr = new int[s.length()];
		int answer = 0;
		
		
		for (int i = 0; i < s.length(); i++) {
			int temp = 0;
			iarr[i] = Integer.parseInt(arr[i].replaceAll("I", "1")
					                         .replaceAll("V", "5")
					                         .replaceAll("X", "10")
					                         .replaceAll("L", "50")
					                         .replaceAll("C", "100")
					                         .replaceAll("D", "500")
					                         .replaceAll("M", "1000"));
			
			if(i != 0 && iarr[i-1] < iarr[i]) {
				temp = iarr[i] - iarr[i-1];
				if(temp < answer) {
					temp -= iarr[i-1];
				}
			}else {
				temp = iarr[i];
			}
			
			if(temp > answer) {
				answer = temp;
			}else {
				answer += temp;
			}
			
			
			

		}
		return answer;

	}

}
