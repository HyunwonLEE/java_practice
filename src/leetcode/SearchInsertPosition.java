package leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {

		int[] nums = { 1,3 };
		int target = 3;
		System.out.println(searchInsert(nums, target));

	}

	public static int searchInsert(int[] nums, int target) {
		int result = 0;

		if (nums[nums.length - 1] < target) {
			result = nums.length;
			return result;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				result = i;
				break;
			} else if (nums[i] > target) {
				result = i;
				break;

			}
		}
		return result;
	}

}
