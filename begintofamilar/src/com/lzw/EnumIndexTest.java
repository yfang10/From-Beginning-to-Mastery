package com.lzw;

import static java.lang.System.out;
public class EnumIndexTest {
	enum Constants2{								//������������ö��������
		Constants_A, Constant_B, Constants_C}
	

public static void main(String args[]) {
	for(int i = 0; i < Constants2.values().length; i++) {
		
		//��ѭ���л�ȡö�����ͳ�Ա������λ��
		out.println(Constants2.values()[i] + "��ö��������λ������ֵ" + Constants2.values
				()[i].ordinal());
	}

}
}
