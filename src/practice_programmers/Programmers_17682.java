package practice_programmers;

public class Programmers_17682 {

	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		Solution_17682 s = new Solution_17682();
		System.out.println(s.solution(dartResult));

	}

}

class Solution_17682 {
	public int solution(String dartResult) {
		int answer = 0;
		String temp = "";
		int[] arr = new int[3];
		int index = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			switch (dartResult.charAt(i)) {
			case '*': {
				arr[index - 1] *= 2;
				if (index > 1)
					arr[index - 2] *= 2;
				break;

			}
			case '#': {
				arr[index - 1] *= -1;
				break;
			}
			case 'S': {
				arr[index] = (int) Math.pow(Integer.parseInt(temp), 1);
				temp = "";
				index++;
				break;
			}
			case 'D': {
				arr[index] = (int) Math.pow(Integer.parseInt(temp), 2);
				temp = "";
				index++;
				break;
			}
			case 'T': {
				arr[index] = (int) Math.pow(Integer.parseInt(temp), 3);
				temp = "";
				index++;
				break;
			}
			default:
				temp += dartResult.charAt(i);
				break;
			}
		}
		for (int i : arr) {
			answer += i;
		}

		return answer;
	}

}