package com.lzw;

interface OutInterface{				//����һ���ӿ�
	public void f();
	
}

public class InterfaceInner {
	public static void main(String args[]) {
		OuterClass2 out = new OuterClass2();			//ʵ����һ��OuterClass2����
		
		//����doit()����, ����һ��OutInterface�ӿ�
		OutInterface outinter = out.doit();
		outinter.f(); 			//����f()����
	}

}

class OuterClass2{
	//����һ���ڲ���ʵ��OuterInterface�ӿ�
	private class InnerClass implements OutInterface{
		InnerClass(String s){				//�ڲ��๹��ŷ���
			System.out.println(s);
		}
		public void f() {				//ʵ�ֽӿ��е�f()����
			System.out.println("�����ڲ����е�f()����");
		}
	}
	public OutInterface doit() {				//����һ������, ����ֵ����ΪOUtInterface�ӿ�
		return new InnerClass("�����ڲ��๹�췽��");
	}
}
