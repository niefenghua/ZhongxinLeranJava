package com.z;


/*  lintcode #366 斐波纳契数列
 *  查找斐波纳契数列中第 N 个数。所谓的斐波纳契数列是指：前2个数是 0 和 1 。第 i 个数是第 i-1 个数和第i-2 个数的和。
 *  斐波纳契数列的前10个数字是：
 *  0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 */

public class FibonacciDemo {

	public static void main(String[] args) {
		System.out.println(fibonacci(47));

	}

	// 此方法没有错误，但比较耗时
	public static int fibonacci(int n) {
		if (n <= 0) {
			System.out.println("n must be more than 0!");
		}
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;

		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	// OK
	public static int fibonacci1(int n) {
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}

		int a = 0;
		int b = 1;
		int result = 0;
		for (int i = 3; i <= n; i++) {
			result = a + b;
			a = b;
			b = result;
		}

		return result;
	}

}
