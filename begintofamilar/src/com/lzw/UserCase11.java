package com.lzw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserCase11 <T extends List>{ 							//限制泛型的类型
	public static void main(String args[]) {
		//可以实例化已经实现List接口的类
		UserCase11<ArrayList> l1 = new UserCase11<ArrayList>();
		UserCase11<LinkedList> l2 = new UserCase11<LinkedList>();
		
	}

}
