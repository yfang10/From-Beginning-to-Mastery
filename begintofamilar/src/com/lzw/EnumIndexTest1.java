package com.lzw;
import static java.lang.System.out;

public class EnumIndexTest1 {
	enum Constants2{
		Constants_A("����ö�ٳ�ԱA"), Constants_B("����ö������B"), Constants_C("����ö������C"), Constants_D(3);
		private String description;
		private int i = 4;
		private Constants2() {
		}
		
		//�������ΪString�͵Ĺ��췽��
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
			out.println(Constants2.values()[i] + "����getDescription()����Ϊ��"
					+ Constants2.values()[i].getDescription());
			
		}
		
		out.println(Constants2.valueOf("Constants_D") + "����getI()����Ϊ�� " + Constants2.valueOf("Constants_D").getI());
		
	}

}
