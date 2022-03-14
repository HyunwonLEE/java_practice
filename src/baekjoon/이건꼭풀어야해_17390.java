package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 이건꼭풀어야해_17390 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] arr = br.readLine().split(" ");

		int N = Integer.parseInt(arr[0]);
		int Q = Integer.parseInt(arr[1]);

		Numbers[] nums = new Numbers[N];
		arr = br.readLine().split(" ");

		for (int i = 0; i < arr.length; i++) {
			nums[i] = new Numbers(Integer.parseInt(arr[i]));
		}

		Arrays.sort(nums, new Comparator<Numbers>() {

			@Override
			public int compare(Numbers o1, Numbers o2) {
				return o1.num - o2.num;
			}
		});
		
		for (int i = 0; i < Q; i++) {
			arr = br.readLine().split(" ");
			int first = Integer.parseInt(arr[0]);
			int second = Integer.parseInt(arr[1]);
			int sum = 0;
			for(int j = first -1; j < second; j++) {
				sum += nums[j].num;
			}

			sb.append(sum).append('\n');
		}
		br.close();
		System.out.println(sb.toString());

	}

}

class Numbers{
	int num;
	Numbers(){
		
	}
	Numbers(int num){
		this.num = num;
	}
}
