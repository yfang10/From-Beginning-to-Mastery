package com.lzw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class AnyClass {
	public static void main(String args[]) {
		//定义ArrayList容器, 设置容器内的值类型为Integer
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		
		for(int i = 0; i < a.size(); i++) {
			//根据容器的长度循环显示容器内的值
			
			System.out.println("获取ArrayList容器的值：" + a.get(i));
			
		}
		
		//定义HashMap容器, 设置容器的键名与键值类型分别为 Integer和String型
		Map<Integer, String> m = new HashMap<Integer, String>();
		for(int i = 0; i < 5; i++) {
			m.put(i, "成员" + i);
		}
		
		for(int i = 0; i < m.size(); i++) {
			//根据键名获取键值
			System.out.println("获取Map容器的值：" + m.get(i));
			
		}
		
		//定义Vector容器, 使容器中的内容为String型
		Vector<String> v = new Vector<String>();
		for(int i = 0; i < 5; i++) {
			v.addElement("成员" + i);											//为Vector容器添加内容
		}
		
		for(int i = 0; i < v.size(); i++) {
			//显示容器中的内容
			System.out.println("获取Vector容器的值：" + v.get(i));
		}
	}

}
