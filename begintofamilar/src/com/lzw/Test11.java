package com.lzw;

public class Test11 {
	private Object b;									//����Object���ͳ�Ա����
	public Object getB() {								//������Ӧ��getXXX()����
		return b; 
	}
	
	public void setB(Object b) {						//������Ӧ��setXXX()����
		this.b = b;
	}
	
	public static void main(String args[]) {
		Test11 t = new Test11();
		t.setB(new Boolean(true));						//����ת��
		System.out.println(t.getB());
		t.setB(new Float(12.3));
		Float f = (Float)(t.getB());					//����ת��
		System.out.println(f);
		
	}

}
