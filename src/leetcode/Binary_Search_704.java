package leetcode;

import java.util.Arrays;

public class Binary_Search_704 {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 2;

		int result = Arrays.binarySearch(nums, target);
		System.out.println(result);

		int low = 0;
		int high = nums.length - 1;
		
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                result =  mid; // key found
        }

	}

}
