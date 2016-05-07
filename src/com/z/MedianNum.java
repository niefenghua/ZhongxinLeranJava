package com.z;

import java.util.Arrays;

public class MedianNum {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 1, 2, 3, -6, -8, -5};
		System.out.println(minSubArray(nums));

	}

	// 找寻中位数
	public static int median(int[] nums) {
		// write your code here
		Arrays.sort(nums);

		int len = nums.length;

		if (len % 2 == 0) {
			return nums[len / 2 - 1];
		} else {
			return nums[len / 2];
		}
	}

	// 给定一个整数数组，找到一个具有最小和的子数组。返回其最小和
	public static int minSubArray(int[] nums) {

		// 排序
		Arrays.sort(nums);

		// 创建子数组和的数组 数组存储前n个元素的和
		int temp = 0;
		int[] minsum = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			temp = temp + nums[i];
			minsum[i] = temp;
		}

		// 找出此数组的最小值
		int result = minsum[0];
		for (int j = 0; j < minsum.length; j++) {
			if (minsum[j] < result)
				result = minsum[j];
		}

		return result;
	}

}
