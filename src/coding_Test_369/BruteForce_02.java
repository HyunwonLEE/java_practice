package coding_Test_369;


public class BruteForce_02 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		input();
		
		re_func(1);
		System.out.println(sb.toString());
		
	}
	
	static void input() {
		FastReader scan = new FastReader();
		N = scan.nextInt();
		M = scan.nextInt();
		selected = new int[M+1];
		used = new int[M+1];
		
	}
	
	static int N,M;
	static int[] selected, used;
	
	static void re_func(int k) {
		if(k == M+1) {
			for(int i = 1; i <= M; i++) {
				sb.append(selected[i]).append(' ');				
			}
			sb.append('\n');
		}else {
			for(int cand = 1; cand <= N; cand++) {
				if(used[cand] == 1) continue;
						
				selected[k] = cand;
				used[cand] = 1;		
				re_func(k+1);
				selected[k] = 0;
				used[cand] = 0;
			}
		}
		
	}
	
	

}
