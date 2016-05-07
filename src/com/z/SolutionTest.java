package com.z;


// 测试单例模式
public class SolutionTest {

	public static void main(String[] args) {
		
		Solution s1=Solution.getInstance();
		Solution s2=Solution.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
