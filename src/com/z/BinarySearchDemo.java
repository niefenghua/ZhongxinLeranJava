package com.z;

/*
 * 有序数组的二分查找
 * 
 * 
 * 
 */

public class BinarySearchDemo {

	public static void main(String[] args) {

		int[] arr = { 3, 6, 7, 8, 8, 12, 14, 16, 21, 21 };
		int index = binarySearch(arr, 21);
		System.out.println(index);

	}

	// 非递归 只适用于非重复数列
	/*
	public static int binarySearch(int[] nums, int target) {
		// write your code here

		int low = 0;
		int high = nums.length - 1;

		while (high >= low) {
			int mid = (low + high + 1) / 2;
			if (nums[mid] == target)
				return mid;
			else {
				if (nums[mid] > target)
					high = mid - 1;
				else
					low = mid + 1;
			}
		}
		
		return -1;
	}
	*/
	

	public static int binarySearch(int[] nums, int target) {
		
		if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (nums[start] == target) {
            return start;
        }
        
        if (nums[end] == target) {
            return end;
        }
        
        return -1;
	}

	
	// 递归实现
	public static int binarySearch(int[] nums, int low, int high, int target) {

		int mid = (low + high) / 2;

		if (nums[mid] == target)
			return mid;
		else {
			if (nums[mid] > target) {
				return binarySearch(nums, low, mid - 1, target);
			}
			if (nums[mid] < target) {
				return binarySearch(nums, mid + 1, high, target);
			}
		}
		return -1;

	}

}
