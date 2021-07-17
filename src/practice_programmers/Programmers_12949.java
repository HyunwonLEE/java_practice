package practice_programmers;
//¸øÇ°

class Solution_12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2.length];
        int a = 0;

        for(int i = 0; i < arr1.length; i++) {
        	

        	for(int j = 0; j < arr2[0].length; j++) {
        		for(int z = 0; z < arr2.length; z++) {
        			if(a > arr1[0].length) a = 0;
        			answer[i][j] += arr1[i][a] * arr2[z][j];
        			a++;
        		}
        		
        	}

        }
        
        return answer;
    }
}
public class Programmers_12949 {

	public static void main(String[] args) {
		
		int[][] arr1 = {{2,3,2}, {4,2,4}, {3,1,4}};
		//int[][] arr2 = {{5,4,3}, {2,4,1}, {3,1,1}, {3,3,3}};
		int[][] arr2 = {{5,3}, {2,4}};
		
		Solution_12949 s = new Solution_12949();
		s.solution(arr1, arr2);

	}

}
