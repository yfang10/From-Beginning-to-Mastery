package com.lzw;

import static java.lang.System.out;

public class EnumMethodTest {
	enum Constants2{						//������������ö��������
		Constants_A, Constants_B
	}

	//����Ƚ�ö�����ͷ���, ��������Ϊö������
	public static void compare(Constants2 c) {
		
		//����values()�������ص�������ѭ������
		
		for(int i = 0; i < Constants2.values().length; i++) {
			
			//���ȽϽ������
			out.println(c + " �� " + Constants2.values()[i] + "�ıȽϽ��Ϊ�� " + c.compareTo(Constants2.values()[i]));
		}
	}
	
	//���������е���compare()����
	public static void main(String arsgs[]) {
		compare(Constants2.valueOf("Constants_B"));
		}
	}

