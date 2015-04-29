package wjj;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project Name:  Test
 * File Name:     TestString.java
 * Package Name:  
 * @Date:         2014年11月3日
 * Copyright (c)  2014, wulian All Rights Reserved.
 */

/**
 * @ClassName: TestString
 * @Function: TODO
 * @Date: 2014年11月3日
 * @author Wangjj
 * @email wangjj@wuliangroup.cn
 */
public class TestString {

	public static void main(String[] args) {
		System.out.println("字符串比较");
		String a = new String("a");
		String b = new String("a");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		String c = "fd";
		String d = "fd";
		System.out.println(c == d);
		System.out.println();

		System.out.println("秒时间*1000转换毫秒，int越界");
		System.out.println(System.currentTimeMillis());
		System.out.println(1415093048 * 1000);// int越界
		System.out.println(1415093048 * 1000L);
		System.out.println();

		System.out.println("强制类型转换");
		System.out.println(4 / 7);
		System.out.println((float) 4 / 7);
		System.out.println((double) 4 / 7);
		System.out.println(4.0 / 7);
		System.out.println();

		System.out.println("当前时间与强制转换");
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis() / 1000);
		System.out.println((int) System.currentTimeMillis());
		System.out.println((int) System.currentTimeMillis() / 1000);// 强制转换优先除法'/'
		System.out.println((int) (System.currentTimeMillis() / 1000));
		System.out.println();

		System.out.println(deviceIdToMac("cmic0110000023344566"));

		System.out.println("4567dfs".toUpperCase());

		System.out.println(Integer.toHexString(12));

		System.out.println("整数除法产生的误差最大接近除数");
		System.out.println(1136 / 17);
		System.out.println(1136f / 17);
		System.out.println((int) (1136f / 17));
		System.out.println(1136 / 17 * 9);// 误差放大9倍
		System.out.println(1136f / 17 * 9);
		System.out.println((int) (1136f / 17 * 9));

		System.out.println("1,3;2,3;4,5;".split(";").length);// 3组
		System.out.println("1,3;".split(";").length);// 1组
		System.out.println("".split(";").length);// 空字符串居然也是1组
		System.out.println(new String[] {}.length);// 0组
		System.out.println((long) 123 / 1000);// 0 、只有float、double才能计算到小数
		System.out.println(getParamFromXml("<local_mac>00:11:22</local_mac>",
				"local_mac"));
		System.out.println("I LOVE_DEVICE ID IS OK".contains("love_device"));

		System.out.println("simpledateformat");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-?-HHmmss-SSS",
				Locale.CHINA);
		System.out.println(sdf.format(new Date()));

		System.out.println(Math.sin(Math.PI / 6));
		System.out.println(Math.toDegrees(Math.PI / 6));
		System.out.println(Math.toRadians(30));
		System.out.println(Math.PI / 6);
		System.out.println(Math.pow(2, 3));
		
		
		System.out.println(12080/8000);
		System.out.println(12080/8*1000);
		
		System.out.println("".split(";").length);//1
		System.out.println(",".split(";").length);//1
		System.out.println(";".split(";").length);//0
		System.out.println("7;".split(";").length);//1
		System.out.println(";7;".split(";").length);//2
		System.out.println(";7;".split(";")[0]);// ""
		System.out.println(";7;".split(";")[1]);//  7 ,可见，最后一个";"不算
		
		System.out.println("abc".contains("a"));//true
		System.out.println("abc".contains(""));//true

		
		System.out.println("Wulian_Camera_dfe4".matches("Wulian_Camera_\\w{4}"));
		System.out.println("icaM01FD".startsWith("icam01"));
		
		System.out.println("没有范德萨(409)".toString().replaceAll("\\(\\d{3}\\)", ""));
		
		
	}

	enum aa {
		a, b, c;
	}

	public static String deviceIdToMac(String deviceId) {
		if (deviceId.length() != 20) {
			return "";
		}
		String macStr = deviceId.substring(8, 20);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 12; i++) {
			sb.append(macStr.charAt(i));
			if (i % 2 == 1) {
				sb.append(":");
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	public static String getParamFromXml(String xmlString, String param) {
		Pattern p = Pattern.compile("<" + param + ">(.+)</" + param + ">");
		Matcher matcher = p.matcher(xmlString);
		if (matcher.find())
			return matcher.group(1);
		return "";
	}
}