package Practice;

public abstract class UseClass3 {
	abstract void AbstractTest();
	UseClass3(){    //ִ�и��๹�췽��
		System.out.println("before AbstractTest()");
		AbstractTest();		////��������˳��󷽷����������า�ǵķ������������Atest���AbstractTest��������
		System.out.println("after Abstract()");
	}
	public static void main(String args[]) {
		new Atest();
	}

}

class Atest extends UseClass3{
	private int i = 1;			//ʹ��Ա������ʼ��
	void AbstractTest() {
	System.out.println("AbstractTest" + i);
}

public Atest(){
	System.out.println(i);
	
}
}