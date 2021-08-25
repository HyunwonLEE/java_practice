package practice_programmers;

public class Programmers_67256 {

	public static void main(String[] args) {
		int[] numers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		Solution_67256 s = new Solution_67256();
		System.out.println(s.solution(numers, hand));

	}

}

//참고
class Solution_67256 {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		int leftIndex = 10;	 // '*' => 10으로 치환
		int rightIndex = 12; // '#' => 12로 치환
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				leftIndex = numbers[i];
				answer += "L";
			}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				rightIndex = numbers[i];
				answer += "R";
			}else { // Center
				int leftLength = getLength(leftIndex, numbers[i]);
				int rightLength = getLength(rightIndex, numbers[i]);

				if(leftLength > rightLength) {
					answer += "R";
					rightIndex = numbers[i];
				} else if(leftLength < rightLength) {
					answer += "L";
					leftIndex = numbers[i];
				} else {
					if(hand.equals("right")) {
						answer += "R";
						rightIndex = numbers[i];
					} else {
						answer += "L";
						leftIndex = numbers[i];
					}
				}
			}
		}
		return answer;
	}

	public static int getLength(int index, int number) {

		// 숫자 0의 경우 11로 치환
		index = (index == 0) ? 11 : index;	
		number = (number == 0) ? 11 : number;

		int x = (index - 1) / 3;
		int y = (index - 1) % 3;
		int numberX = number / 3;
		int numberY = 1;

		return Math.abs(x-numberX) + Math.abs(y-numberY);
	}
}