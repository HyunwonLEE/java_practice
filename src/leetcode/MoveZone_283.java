package leetcode;

import java.util.ArrayList;

public class MoveZone_283 {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };

		moveZeroes(nums);

	}

	public static void moveZeroes(int[] nums) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0)
				list2.add(nums[i]);
			else
				list1.add(nums[i]);

		}
		
		for(int i = 0; i < nums.length; i++) {
			if(list1.size() > 0)
			nums[i] = list1.remove(0);
			else
				nums[i] = list2.remove(0);
		}
		
		
		for (int i : nums) {
			System.out.println(i);
		}


	}
}



//Integer[] arr = new Integer[nums.length];
//
//for (int i = 0; i < nums.length; i++) {
//	arr[i] = nums[i];
//}
//
//Arrays.sort(arr, new Comparator<Integer>() {
//	@Override
//	public int compare(Integer i1, Integer i2) {
//		if (i1 == 0 || i2 == 0) {
//			return i2 - i1;
//		} else {
//			return i1 - i2;
//		}
//	}
//});
//
//for (int i = 0; i < nums.length; i++) {
//	nums[i] = arr[i];
//	System.out.println(nums[i]);
//}