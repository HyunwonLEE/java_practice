package practice_programmers;



class Solution_12977 {
	public int solution(int[] nums) {
		int answer = 0;
		int[] array = new int[3001];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int z = j+1; z < nums.length; z++) {
					if (i != j && i != z && j != z) {
						array[nums[i] + nums[j] + nums[z]]++;
					}
				}
			}
		}
		for (int i = 2; i < array.length; i++) {
			if(array[i] == 0) continue;
			for (int j = 2; j < i/2; j++) {							
				if(i % j == 0) 
					array[i] = 0;
			}

		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0) answer += array[i];
		}



		return answer;
	}
}

public class Programmers_12977 {

	public static void main(String[] args) {

		int[] nums = { 1,2,7,6,4 };
		Solution_12977 s = new Solution_12977();
		System.out.println(s.solution(nums));
	}

}
