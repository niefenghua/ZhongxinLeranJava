package com.z;

public class Up {

	public static void main(String[] args) {
		System.out.println(climbStairs2(44));
	}

	public static int climbStairs(int n) {
		// write your code here
		int result = 0;
		if (n == 1)
			result = 1;
		if (n == 2)
			result = 2;
		if (n > 2) {
			return climbStairs(n - 2) + climbStairs(n - 1);
		}
		return result;

	}
	public static int climbStairs2(int n) {
		
		if (n  <= 1) {
            return 1;
        }
		if (n == 2) {
            return 2;
        }
		
        //  前一个结果
        int lastlast = 1;
        
        // 再前一个结果
        int last = 2;
        
        //   用now存储暂时结果
        int now = 0;
        for (int i = 3; i <= n; i++) {
            now = last + lastlast;
            lastlast = last;
            last = now;
        }
        return now;
	}

}
