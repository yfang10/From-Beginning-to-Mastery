package com.lzw;

public class Test11 {
	private Object b;									//定义Object类型成员变量
	public Object getB() {								//设置相应的getXXX()方法
		return b; 
	}
	
	public void setB(Object b) {						//设置相应的setXXX()方法
		this.b = b;
	}
	
	public static void main(String args[]) {
		Test11 t = new Test11();
		t.setB(new Boolean(true));						//向上转型
		System.out.println(t.getB());
		t.setB(new Float(12.3));
		Float f = (Float)(t.getB());					//向下转型
		System.out.println(f);
		
	}

}
