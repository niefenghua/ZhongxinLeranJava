package com.z;

/* lintcode #365
 * 计算在一个 32 位的整数的二进制表式中有多少个 1
*/

public class BinCountDemo {

	public static void main(String[] args) {
		System.out.println(countOnes(12));
	}

	public static int countOnes(int num) {

		String str = Integer.toBinaryString(num);
		System.out.println(str);
		char[] strs = str.toCharArray();
		int count = 0;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i] == '1') {
				count = count + 1;
			}
		}

		return count;
	}

}
