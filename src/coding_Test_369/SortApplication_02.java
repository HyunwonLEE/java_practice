package coding_Test_369;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortApplication_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Numbers[] num = new Numbers[N];
 		String[] arr = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {						
			int number = Integer.parseInt(arr[i]);
			int index = i;			
			num[i] = new Numbers(number, index);
		}
		
		Arrays.sort(num, new Comparator<Numbers>() {

			@Override
			public int compare(Numbers o1, Numbers o2) {	
				return o1.number - o2.number;
			}
		});
		//3 2 1
		//1 0 2
		
//		for(int i = 0; i < num.length; i++) {
//			num[i].number = i;
//		}
		
//		Arrays.sort(num, new Comparator<Numbers>() {
//
//			@Override
//			public int compare(Numbers o1, Numbers o2) {
//				return o1.index - o2.index;
//			}
//		});
		
		int[] answer = new int[N];
		
		for(int i = 0; i < N; i++) {
			answer[num[i].index] = i;
		}
		
		for(int i = 0; i < num.length; i++) {
			sb.append(answer[i]).append(' ');			
		}
		System.out.println(sb.toString());
		
	}

}

class Numbers{
	public int number;
	public int index;
	public Numbers() {
	
	}
	
	public Numbers(int number, int index) {
		this.number = number;
		this.index = index;
	}
	public Numbers(int index) {
		this.index = index;
	}
	
	
}
