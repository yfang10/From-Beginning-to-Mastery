package Practice;

public abstract class UseClass3 {
	abstract void AbstractTest();
	UseClass3(){    //执行父类构造方法
		System.out.println("before AbstractTest()");
		AbstractTest();		////如果调用了抽象方法，调用子类覆盖的方法。这里调用Atest类的AbstractTest（）方法
		System.out.println("after Abstract()");
	}
	public static void main(String args[]) {
		new Atest();
	}

}

class Atest extends UseClass3{
	private int i = 1;			//使成员变量初始化
	void AbstractTest() {
	System.out.println("AbstractTest" + i);
}

public Atest(){
	System.out.println(i);
	
}
}