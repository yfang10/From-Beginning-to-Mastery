package com.lzw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserCase11 <T extends List>{ 							//���Ʒ��͵�����
	public static void main(String args[]) {
		//����ʵ�����Ѿ�ʵ��List�ӿڵ���
		UserCase11<ArrayList> l1 = new UserCase11<ArrayList>();
		UserCase11<LinkedList> l2 = new UserCase11<LinkedList>();
		
	}

}
