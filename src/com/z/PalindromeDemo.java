package com.z;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* lintcode #452
 * 给定一个字符串，判断其是否为一个回文串。要求：只包含字母和数字，忽略大小写，忽略空格。
*/

public class PalindromeDemo {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A mana中 plan ,a canalPa nama"));

	}

	public static boolean isPalindrome(String s) {
		// Write your code here
		String str1 = s.replace(" ", "").toLowerCase();
		String regex = "[^a-zA-Z0-9]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str1);
		String str = m.replaceAll("").trim();

		int len = str.length();
		boolean flag = true;
		for (int i = 0; i < len / 2; i++) {

			if (str.charAt(i) != str.charAt(len - i - 1)) {
				flag = false;
				break;
			}

		}

		return flag;
	}

}
