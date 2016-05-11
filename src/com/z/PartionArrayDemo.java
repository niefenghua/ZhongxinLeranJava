package com.z;

/*
 * 将一个整数数组分割 奇数在前偶数在后
 * 
 * 
 */

public class PartionArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 7, 6, 8, 11, 5, 13, 18, 10, 12 };
		int[] new_arr = partitionArray(arr);

		for (int i = 0; i < new_arr.length; i++) {
			System.out.print(new_arr[i] + " ");
		}

	}

	// 新构建一个数组 奇数从0开始存 偶数从最后往前存
	// 时间复杂度O(n)
	// 空间上增加了一个数组的内存占用
	public static int[] partitionArray(int[] nums) {

		int[] new_arr = new int[nums.length];

		int start = 0;
		int end = nums.length - 1;

		for (int i : nums) {
			if (i % 2 != 0) {
				new_arr[start] = i;
				start++;
			} else {
				new_arr[end] = i;
				end--;
			}
		}

		return new_arr;

	}

}
