/**
 * Project Name:  Test
 * File Name:     TextEnum.java
 * Package Name:  wjj
 * @Date:         2015年1月21日
 * Copyright (c)  2015, wulian All Rights Reserved.
 */

package wjj;

/**
 * @ClassName: TextEnum
 * @Function: TODO
 * @Date: 2015年1月21日
 * @author Wangjj
 * @email wangjj@wuliangroup.cn
 */
public class TextEnum {
	public enum ThirdType {
		weixin("weixin"), weibo("weibo"), tencent("tencent"), twitter("twitter"), facebook(
				"facebook"), google("google222");
		String name;

		private ThirdType(String name) {
			this.name = name;

		}

	}

	public static void main(String[] args) {
		System.out.println(ThirdType.weibo);
	}

}
