package exam;

public class 비트망고_02 {

	public static void main(String[] args) {
		int[][] circles = {{-4,0,2},{-4,0,4},{-4,0,6},{2,0,8}};
		solution(circles);
	}
	public static int solution(int[][] circles) {
		int answer = 1;
		int cirlen = circles.length;
		
		for(int i = 0; i < cirlen; i++) {
			for(int j = 0; j < cirlen; j++) {
				if(i == j) continue;
				
			}
		}
		
		return answer;
	}

}
