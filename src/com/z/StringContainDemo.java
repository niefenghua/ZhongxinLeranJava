package com.z;


/* lintcode #366 比较字符串
 * 比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母
 * 给出 A = "ABCD" B = "ACD"，返回 true
 * 给出 A = "ABCD" B = "AABC"， 返回 false
 */

public class StringContainDemo {

	public static void main(String[] args) {
		String as = "ABCDEF";
		String bs = "BCD";
		String cs = "BCG";

		System.out.println(compareStrings(as, bs));
		System.out.println(compareStrings(as, cs));

	}

	public static boolean compareStrings(String A, String B) { 
		
		// A "ASDFNKMLFJN"
		// B "FNKML"
	
		
		// 构建长度为26的数组，用0填充
		int[] counts = new int[26];
		for (int i = 0; i < 26; i++) {
			counts[i] = 0;
		}

		// 首先遍历长串,记录A-Z每个字母出现的次数，出现一次加1
		// [1,1,1,1,1,1,0,0,0,0,0,0..]
		for (int i = 0; i < A.length(); i++) {
			counts[A.charAt(i) - 'A']++;
		}

		// 然后遍历短串，同样记录A-Z每个字母出现的次数，出现一次减1
		// [1,0,0,0,1,1,0,0,0,0,0,0..]
		for (int i = 0; i < B.length(); i++) {
			counts[B.charAt(i) - 'A']--;

			// 只要数组元素出现小于1的数，表示出现B有A没有的字母，返回false
			if (counts[B.charAt(i) - 'A'] < 0) {
				return false;
			}
		}

		return true;
	}
}
