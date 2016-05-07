package com.z;

/*
 * lintcode #204 单例模式
 * 
 * 
 * 
 */

public class Solution {

	private Solution() {
	}
	
	// 饿汉 一开始就加载
	// private static Solution solution =new Solution();
	// public static Solution getInstance() {
	// // write your code here
	// return solution;
	// }

	// 懒汉 使用时才加载
	private static Solution solution = null;

	public static Solution getInstance() {

		if (solution == null) {
			solution = new Solution();
		}
		return solution;
	}

};
