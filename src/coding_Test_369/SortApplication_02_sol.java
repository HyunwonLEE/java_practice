package coding_Test_369;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortApplication_02_sol {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		long[] nums = new long[N];

		for (int i = 0; i < N; i++) {
			nums[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(nums);

		int count = 1;
		int maxcnt = 1;
		long num = nums[0];;
		long prenum = nums[0];
		for (int i = 1; i < N; i++) {
			if (nums[i] == prenum) {
				count++;
			} else {
				count = 1;
				prenum = nums[i];
			}

			if (count > maxcnt) {
				num = prenum;
				maxcnt = count;
			}
			
		}

		System.out.println(num);

	}

}
