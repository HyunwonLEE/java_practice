package leetcode;

import java.util.LinkedList;

public class RotateArray_189 {

	public static void main(String[] args) {

		int[] nums = { 1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums, k);

	}

	public static void rotate(int[] nums, int k) {

		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		
		for(int i = 0; i < k; i++) {
			int last = list.removeLast();
			list.addFirst(last);
		}
		
		for(int i = 0; i < nums.length ; i++) {
			nums[i] = list.removeFirst();
		}
		
		
		
		for (Integer integer : nums) {
			System.out.println(integer);
		}

	}

}



/*
///////////////////////////////////////////////////////
//for (int i = 0; i < k; i++) {			
//for (int j = 0; j < nums.length -1; j++) {
//int first = nums[j];
//int last = nums[nums.length-1];
//nums[j] = last;
//nums[nums.length-1] = first; 
//}
//
//}
////////////////////////////////////////////////
//int[] temp = nums.clone();
//
//for (int i = 0; i < k; i++) {
//nums[i] = temp[temp.length -k + i];
//}
//
//for (int i = k; i < temp.length; i++) {
//nums[i] = temp[i-k];
//}
//
/////////////////////////////////////////////////
* 
*/