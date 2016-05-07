package com.z;

import java.util.ArrayList;

/* lintcode #427 生成括号
 * 给定 n 对括号，请写一个函数以将其生成新的括号组合，并返回所有组合结果。
 * 给定 n = 3, 可生成的组合如下:
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 */


public class GenerateParenthesisDemo {

	public static void main(String[] args) {
		ArrayList<String> strings = generateParenthesis(4);
		// System.out.println(strings);
		for (String s : strings) {
			System.out.println(s);
		}

	}

	public static ArrayList<String> generateParenthesis(int n) {
		// Write your code here
		ArrayList<String> result = new ArrayList<String>();
		if (n <= 0) {
			return result;
		}
		
		helper(result, "", n, n);
		return result;

	}

	
	/* result 结果
	 * paren 先前生成的结果
	 * left 剩余左括号的数量
	 * right 剩余右括号的数量
	 */
	
	public static void helper(ArrayList<String> result, String paren, int left, int right) {
		
		if (left == 0 && right == 0) {
			result.add(paren);
			return;
		}

		if (left > 0) {
			helper(result, paren + "(", left - 1, right);
		}

		if (right > 0 && left < right) {
			helper(result, paren + ")", left, right - 1);
		}
	}

}
