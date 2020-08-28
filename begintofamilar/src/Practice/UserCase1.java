package Practice;

public class UserCase1 {
	enum Constants2{						//将常量放置在枚举类型中
		Constants_A, Constants_B}
	
	//使用接口定义常量
	
	public static void doit2(Constants2 c) {			//定义一个参数对象是枚举类型的方法
		switch(c) {										//根据枚举类型对象做不同操作
		case Constants_A:
		System.out.println("doit2() Constants_A");
		break;
		
		case Constants_B:
			System.out.println("doit2() Constants_B");
			break;
		
		}
	
	}
	
	public static void main(String args[]) {
		UserCase1.doit2(Constants2.Constants_A);
		UserCase1.doit2(Constants2.Constants_B);
	}

}
