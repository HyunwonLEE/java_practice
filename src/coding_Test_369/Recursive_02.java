package coding_Test_369;

public class Recursive_02 {
	static int[] arr;
	static int N;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		N = 4;
		arr = new int[N];
		rec_func(1);
		System.out.println(sb.toString());
	}
	
	static void rec_func(int k) {
		if(k == 4) {
			for(int i =1; i <= 3; i++) {
				sb.append(arr[i]);
			}
			sb.append('\n');
		}else {

			for (int cand = 1; cand <= 4; cand++) {
				arr[k] = cand;
				rec_func(k+1);
				arr[k] = 0;
				
			}
		}
	}

}
