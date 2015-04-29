/**
 * Project Name:  Test
 * File Name:     TestMath.java
 * Package Name:  wjj
 * @Date:         2015年2月15日
 * Copyright (c)  2015, wulian All Rights Reserved.
 */

package wjj;

/**
 * @ClassName: TestMath
 * @Function: TODO
 * @Date: 2015年2月15日
 * @author Wangjj
 * @email wangjj@wuliangroup.cn
 */
public class TestMath {
	public static void main(String[] args) {
		long start1 = System.currentTimeMillis();
		System.out.println(Math.pow(2, 32));
		System.out.println(System.currentTimeMillis()-start1);
		
		long start2 = System.currentTimeMillis();
		System.out.println((1L<<32));
		System.out.println(System.currentTimeMillis()-start2);
		
	}
	
}
