package com.z;


/*
 * lintcode #148 颜色分类
 * 给定一个包含红，白，蓝且长度为 n 的数组，将数组元素进行分类使相同颜色的元素相邻，并按照红、白、蓝的顺序进行排序。
 * 我们可以使用整数 0，1 和 2 分别代表红，白，蓝。
 * 给你数组 [1, 0, 1, 2], 需要将该数组原地排序为 [0, 1, 1, 2]。
 * 
 * 
 */




public class SortColorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 0, 1, 0, 2, 1, 1, 2, 0, 1, 2, 2, 1 };
		SortColors(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

	private static int[] SortColors(int[] nums) {


		int countZero = 0;
		int countOne = 0;
		int countTwo = 0;

		for (int i : nums) {
			if (i == 0)
				countZero = countZero + 1;
			else if (i == 1)
				countOne = countOne + 1;
			else
				countTwo = countTwo + 1;
		}

		for (int i = 0; i < countZero; i++) {
			nums[i] = 0;
		}
		for (int i = 0; i < countOne; i++) {
			nums[i + countZero] = 1;
		}
		for (int i = 0; i < countTwo; i++) {
			nums[i + countOne + countZero] = 2;
		}

		return nums;

	}

}
