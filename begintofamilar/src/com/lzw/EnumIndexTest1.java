package com.lzw;
import static java.lang.System.out;

public class EnumIndexTest1 {
	enum Constants2{
		Constants_A("我是枚举成员A"), Constants_B("我是枚举类型B"), Constants_C("我是枚举类型C"), Constants_D(3);
		private String description;
		private int i = 4;
		private Constants2() {
		}
		
		//定义参数为String型的构造方法
		private Constants2(String description) {
			this.description = description;
		}
		
		private Constants2(int i ) {
			this.i = this.i + i;
		}
		public String getDescription() {
			return description;
		}
		
		public int getI() {
			return i;
		}
	}
	
	public static void main(String args[]) {
		for(int i = 0; i < Constants2.values().length; i++) {
			out.println(Constants2.values()[i] + "调用getDescription()方法为："
					+ Constants2.values()[i].getDescription());
			
		}
		
		out.println(Constants2.valueOf("Constants_D") + "调用getI()方法为： " + Constants2.valueOf("Constants_D").getI());
		
	}

}
