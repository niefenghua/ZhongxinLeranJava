package com.z;

/*
 * 有 n 个硬币排成一条线。两个参赛者轮流从右边依次拿走 1 或 2 个硬币，直到没有硬币为止。
 * 拿到最后一枚硬币的人获胜。
 * 请判定 第一个玩家 是输还是赢？
 * 
 * 挑战 ：O(1) 时间复杂度且O(1) 存储
 * 思路：只要是3的倍数，后手根据先手拿硬币，ta拿1，就拿2，ta拿2，就拿1，后手必赢
 */

public class CoinLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean firstWillWin(int n) {
		// write your code here

		return n % 3 != 0;
	}

}
