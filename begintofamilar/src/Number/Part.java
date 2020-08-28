package Number;

public class Part {
	static final double PI = 3.14;
	static int age = 23;
	public static void main(String agrs[]) {
		final int number;
		number = 1235;
		age = 22;
		//number = 1236;		//错误的代码，因为number为常量，只能进行一次赋值
		System.out.println("常量PI的值为： " + PI);
		System.out.println("赋值后number的值为： " + number);
		System.out.println("int型变量age的值为： " + age);
		
		
	}

}
