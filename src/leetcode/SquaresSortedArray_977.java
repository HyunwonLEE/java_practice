package leetcode;

import java.util.Arrays;


public class SquaresSortedArray_977 {

	public static void main(String[] args) {

		int[] nums = {-4,-1,0,3,10};
		System.out.println(sortedSquares(nums));
	}

	public static int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			result[i] = (int)Math.pow(Math.abs(nums[i]), 2); 
		}
		
		Arrays.sort(result);
		
		
		return result;
	}

}
