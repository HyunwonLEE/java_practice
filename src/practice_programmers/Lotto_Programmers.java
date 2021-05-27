package practice_programmers;

import java.util.Arrays;

public class Lotto_Programmers {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		solution.solution(lottos, win_nums);
		

	}

}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int blank = 0;
        int win = 0;
        for(int i =0; i < win_nums.length; i++) {
        	for(int j = i; j < win_nums.length; j++) {
        		if(win_nums[i] == lottos[j]) {
        			win++;
        			win_nums[i] = 0;
        		}else if(win_nums[i] < lottos[j]) {
        			break;
        		}
        	}
        	if(lottos[i] == 0) blank++;
        }
        answer[0] = win + blank;
        answer[1] = win;
        for(int i = 0; i < answer.length; i++) {
        	switch (answer[i]) {
			case 2 : {				
				answer[i] = 5;
				break;
			}
			case 3 :{
				answer[i] = 4;
				break;
			}
			case 4 :{
				answer[i] = 3;
				break;
			}
			case 5 :{
				answer[i] = 2;
				break;
			}
			case 6 :{
				answer[i] = 1;
				break;
			}
			default:
				answer[i] = 6;
				break;
			}
        }
        
        for (int i : answer) {
			System.out.println(i);
		}
        
        return answer;
    }
}