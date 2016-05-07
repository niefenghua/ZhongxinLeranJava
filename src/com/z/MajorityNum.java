package com.z;

import java.util.ArrayList;

// lintcode 主元素
// 返回数组中出现次数最多的数
public class MajorityNum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, -1, 2, 1, 4, -1, 1, 2, -1 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : a) {
			list.add(i);
		}

		int mn = majorityNumber(list);
		System.out.println(mn);

	}

	
	public static int majorityNumber(ArrayList<Integer> nums) {
		// write your code

		 int count = 0;
	        int cur = nums.get(0);
	        for(int i = 0; i < nums.size(); i++) {
	            if(count == 0) {
	                cur = nums.get(i);
	                count = 1;
	            }else {
	                if(cur == nums.get(i)) {
	                    count++;
	                }else{
	                    count--;
	                }
	            }
	        }
	        return cur;
	}

}
