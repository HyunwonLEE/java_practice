package exam;

public class ∫Ò∆Æ∏¡∞Ì_01 {

	public static void main(String[] args) {
		int n = 4;
		boolean horizontal = true;
		soulution(n, horizontal);

	}

	public static int[][] soulution(int n, boolean horizontal) {
		int[][] answer = new int[n][n];
		int x = 0;
		int y = 0;
		int count = 1;
		int max = 1;
		boolean[] minus = new boolean[2];
		while (count < n * n) {

			answer[y][x] = count;
			count++;
			if (horizontal) {
				if(minus[0]) {
					x--;
				}else {
					x++;	
				}
							
				
			} else {
				if(minus[1]) {
					y--;
				}else {
					y++;	
				} 
				
			}
			max = (int) Math.sqrt(count);
			if(horizontal && (max == x || x == 0) ) {
				horizontal = !horizontal;
				if(y == 0) {
					minus[0] = true;	
				}else {
					minus[0] = false;
				}
				
			}else if(!horizontal && (max == y || y == 0)){
				horizontal = !horizontal;
				if(x == 0) {
					minus[1] = true;	
				}else {
					minus[1] = false;
				}
				
			}
			

		}

		return answer;
	}

}


