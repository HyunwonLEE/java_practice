package coding_Test_369;


public class BruteForce_01 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		input();
		
		// 1 ��° ���Һ��� M ��° ���Ҹ� ���ǿ� �´� ��� ����� ã����
		re_func(1);
        System.out.println(sb.toString());
		
	}
	
	static void input() {
		FastReader scan = new FastReader();
		N = scan.nextInt();
		M = scan.nextInt();
		selected = new int[M+1];
	}
	
	static int N, M;
    static int[] selected;
    
    
    
    
    // Recurrence Function (��� �Լ�)
    // ���� M ���� ���� ��   => ���ǿ� �´� Ž���� �� ���� ������ ��!
    // ���� M ���� ���� ���� => k ��°���� M��° ���Ҹ� ���ǿ� �°� ���� ��� ����� �õ��Ѵ�.
    
    static void re_func(int k) {
    	if(k == M+1) {// �� �����!
            // selected[1...M] �迭�� ���Ӱ� Ž���� ���
    		for(int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
    		sb.append('\n');
    	}else {
    		for(int cand = 1; cand <= N; cand++) {
    			selected[k] = cand;
    			 // k+1 ������ M ������ �� ä���ִ� �Լ��� ȣ�����ش�.
    			re_func(k+1);
    			selected[k] = 0;
    		}
    	}
    }
    
    /*
    
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public FastReader(String s) throws FileNotFoundException{
			br = new BufferedReader(new FileReader(new File(s)));
		}
		
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
					
				}catch (IOException e){
					e.printStackTrace();
					
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
*/
    
}
